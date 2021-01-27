public class Inimene {
    public String nimi;
    private Integer pikkus;
    private Integer mass;

    public Inimene(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getPikkus() {
        return pikkus;
    }

    public void setPikkus(Integer pikkus) {
        this.pikkus = pikkus;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public double kmi() {
        double pikkusRuut = (getPikkus() * getPikkus());
        double indeks = (getMass() / pikkusRuut) * 10000;
        return indeks;
    }

}
