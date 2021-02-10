public class Magamistuba {
    private String nimetus;
    private Sein sein1;
    private Sein sein2;
    private Sein sein3;
    private Sein sein4;
    private Lagi lagi;
    private Voodi voodi;
    private Lamp lamp;
    private AknadUksed aknadUksed;

    public Magamistuba(String nimetus, Sein sein1, Sein sein2, Sein sein3, Sein sein4, Lagi lagi, Voodi voodi, Lamp lamp, AknadUksed aknadUksed) {
        this.nimetus = nimetus;
        this.sein1 = sein1;
        this.sein2 = sein2;
        this.sein3 = sein3;
        this.sein4 = sein4;
        this.lagi = lagi;
        this.voodi = voodi;
        this.lamp = lamp;
        this.aknadUksed = aknadUksed;
    }

    public void valmistaVoodi() {
        System.out.println("Magamistuba -> Valmistatakse voodi");
        this.voodi.valmis();
    }

    public void valmistaLamp() {
        System.out.println("Magamistuba -> Valmistatakse lamp");
        this.lamp.lulitaSisse();
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void AknadUksedKinni() {
        System.out.println("Magamistuba -> Aknad ja uksed pannakase kinni");
        this.aknadUksed.paneKinni();
    }

    public AknadUksed getAknadUksed() {
        return aknadUksed;
    }

    public void pindala() {

    }
}
