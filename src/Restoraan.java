public class Restoraan {
    private String restoraniNimi;
    private String soogiTyyp;

    public Restoraan(String restoraniNimi, String soogiTyyp) {
        this.restoraniNimi = restoraniNimi;
        this.soogiTyyp = soogiTyyp;
    }

    public void avaRestoraan() {
        System.out.println("Restoraan " + this.restoraniNimi + "on nüüd avatud");

    }

    @Override
    public String toString() {
        return this.restoraniNimi + " on restoraan, kus on pakutud " + this.soogiTyyp;
    }
}
