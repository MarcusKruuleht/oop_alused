public class Inimene {
    private String nimi;
    private double pikkus;
    private double mass;

    public Inimene(String nimi) {
        this.nimi = nimi;
        this.pikkus = 0.0;
        this.mass = 0.0;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(double pikkus) {
        this.pikkus = pikkus;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double kmi() {
        double pikkusRuut = (getPikkus() * getPikkus());
        double indeks = (getMass() / pikkusRuut);
        return indeks;
    }

    public void suurendaKaal() {
        this.mass++;
    }

    public void suurendaKaal(double kg) {
        this.mass = +kg;
    }

    public void vahendaKaal() {
        this.mass = -1;
    }

    public void normaalKaal() {
        // kui kehamasiiindeks on 19 - 24.9 - see on norm
        // kui kmi on <19 - tuleb inimest sööta
        // nii, et ta võtaks 1 kg juurde iga kord
        // ka kontrollida, kas nüüd asi korras
        while (this.kmi() < 19.0) {
            this.suurendaKaal();
            System.out.printf(getNimi() + ", kehamassiindeks: " + "%.2f%n", kmi());
            System.out.println(getMass());

            while (this.kmi() > 25.0) {
                this.vahendaKaal();
                System.out.printf(getNimi() + ", kehamassiindeks: " + "%.2f%n", kmi());
                System.out.println(getMass());

                if (this.kmi() >= 19.0 && this.kmi() <= 25.0) {
                    System.out.println(this.nimi + ", sinu kaal on korras");
                }

            }
            // ja juhul kui kaal on 25 ja suurem
            // siis tuleb pakkuda vähenedada kaalu 1 kg võrra

        }
    }
}
