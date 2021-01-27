/*
 * loo HashMap tüüpi objekt main meetodis
 * võti ja väärtus on String
 * Salvesta mapi inimeste nimed - võtmena ja hüüdnimed - väärtusena
 * Kasuta andmete hoidmiseks ainult väikesed tähed
 *
 * matti - mage
 * mikael - mixu
 * arto - arppa
 *
 * Küsi kasutaja nimi ha trüki tema hüüdnimi
 * */


public class Test {
    public static void main(String[] args) {

        Inimene matti = new Inimene("Matti");
        Inimene john = new Inimene("John");

        matti.setPikkus(180);
        matti.setMass(86);

        john.setPikkus(175);
        john.setMass(64);

        System.out.println(matti.getNimi() + ", kehamassiindeks: " + matti.kmi());
        System.out.println(john.getNimi() + ", kehamassiindeks: " + john.kmi());
        /*
        Ristkylik r1 = new Ristkylik();
        r1.setLaius(4.6);
        r1.setKorgus(7.2);
        System.out.println(r1);
        System.out.println("============");
        Ristkylik r2 = new Ristkylik();
        r2.setLaius(-4.6);
        r2.setKorgus(7.2);
        System.out.println(r2);
        System.out.println("============");
        Ristkylik r3 = new Ristkylik();
        r3.setLaius(-4.6);
        r3.setKorgus(-7.2);
        System.out.println(r3);
        */

        /*
        KahanevLoendur loendur = new KahanevLoendur(2);

        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();
        */
    }

}