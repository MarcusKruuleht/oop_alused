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
        // loo konto tüüpi objekt nimega marcusKonto
        Konto marcusKontoSEB = new Konto();
        Konto marcusKontoSWED = new Konto();
        // lisan konkreetsed väärtused
        marcusKontoSEB.looKonto("Marcus", 0.0);
        marcusKontoSWED.looKonto("Marcus", 0.0);

        marcusKontoSEB.lisaRaha(20.0);
        marcusKontoSWED.lisaRaha(-50.0);
        // väljastame tulemused
        System.out.println("SEB");
        System.out.println("Konto omanik = " + marcusKontoSEB.omanik);
        System.out.println("Konto bilans = " + marcusKontoSEB.bilans);
        marcusKontoSEB.votaRaha(10.0);
        System.out.println("Konto bilans = " + marcusKontoSEB.bilans);
        marcusKontoSEB.votaRaha(20.0);
        System.out.println("Konto bilans = " + marcusKontoSEB.bilans);
        marcusKontoSEB.teeUlekanne(marcusKontoSWED, 10.0);
        System.out.println("Konto bilans = " + marcusKontoSEB.bilans);
        marcusKontoSEB.teeUlekanne(marcusKontoSWED, 10.0);
        System.out.println("Konto bilans = " + marcusKontoSEB.bilans);
        System.out.println();
        System.out.println("SWED");
        System.out.println("Konto omanik = " + marcusKontoSWED.omanik);
        System.out.println("Konto bilans = " + marcusKontoSWED.bilans);
    }
}