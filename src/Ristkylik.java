public class Ristkylik {
    private double laius;
    private double korgus;

    public double getLaius() {
        return laius;
    }

    public void setLaius(double laius) {
        this.laius = this.vaartuseKontroll(laius);
    }

    public double getKorgus() {
        return korgus;
    }

    public void setKorgus(double korgus) {
        this.korgus = this.vaartuseKontroll(korgus);
    }

    private double vaartuseKontroll(double vaartus) {
        double tulemus;
        if (vaartus < 0.0) {
            return Math.abs(vaartus);
        }
        return vaartus;
    }

    @Override
    public String toString() {
        return "Ristkülik:" + this.laius + " x " + this.korgus;

    }

}