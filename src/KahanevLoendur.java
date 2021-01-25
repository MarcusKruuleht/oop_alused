public class KahanevLoendur {
    private int vaartus;   // objekti muutuja (atribuut), mis hoiab meeles loenduri väärtust
    private int algVaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
        this.algVaartus = vaartusAlguses;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        // kirjuta siia kood, mille abil loenduri vaartus väheneb 1 võrra
        if (algVaartus != 0) {

        }
    }

    // ja siia ülejäänud vajalikud meetodid
}


