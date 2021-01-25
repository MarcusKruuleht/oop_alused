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
        KahanevLoendur loendur = new KahanevLoendur(2);

        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();
    }
}