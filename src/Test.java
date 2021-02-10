public class Test {
    public static void main(String[] args) {
       Sein seinPohi = new Sein("põhi sein", 5);
       Sein seinLouna = new Sein("lõuna sein", 5);
       Sein seinLaane = new Sein("lääne sein", 6);
       Sein seinIda = new Sein("ida sein", 6);

       Lagi lagi = new Lagi(2.5, "helesinine");

       Voodi voodi = new Voodi("kahele", 2, 2, 1, 0.7);

       Lamp lamp = new Lamp("Klassikaline", false);

       AknadUksed aknadUksed = new AknadUksed("Puidust", false, 5);
       Magamistuba magamistuba = new Magamistuba("külaliste", seinPohi, seinLaane, seinLouna, seinIda, lagi, voodi, lamp, aknadUksed);
       magamistuba.valmistaVoodi();
       magamistuba.valmistaLamp();
       System.out.println(magamistuba.getLamp().isSisseLulitatud());
       magamistuba.AknadUksedKinni();
       System.out.println(magamistuba.getAknadUksed().isKinni());
       System.out.println("Pindala: " + 2 * lagi.getKorgus() * (seinIda.getLaius() + seinPohi.getLaius()) + " m2");
       System.out.println("Pindala uksed ja aknad kaasaarvatud: " + (2 * lagi.getKorgus() * (seinIda.getLaius() + seinPohi.getLaius()) - aknadUksed.getPindala()) + " m2");

    }
}