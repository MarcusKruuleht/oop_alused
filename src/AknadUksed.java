public class AknadUksed {
    private String stiil;
    private double pindala;
    private boolean kinni;

    public AknadUksed(String stiil, boolean kinniLahti, double pindala) {
        this.pindala = pindala;
        this.stiil = stiil;
        this.kinni = kinniLahti;
    }

    public String getStiil() {
        return stiil;
    }


    public double getPindala() {
        return pindala;
    }

    public boolean isKinni() {
        return kinni;
    }

    public void paneKinni() {
        if (!this.kinni) {
            this.kinni = true;
            System.out.println("Uksed ja aknad -> kinni pandud");
        }
    }
}
