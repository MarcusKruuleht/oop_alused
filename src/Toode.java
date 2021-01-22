public class Toode {

    public String Nimetus;
    public Double Hind;
    public Integer Kogus;


    public Toode(String nimetus, Double hind, Integer kogus) {
        this.valjastaToode(nimetus, hind, kogus);
        System.out.println("Toode: " + nimetus);
        System.out.println("Hind: " + hind);
        System.out.println("Kogus: " + kogus);
    }

    public void valjastaToode(String nimetus, Double hind, Integer kogus) {
        this.Nimetus = nimetus;
        this.Hind = hind;
        this.Kogus = kogus;
    }

}
