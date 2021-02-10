public class Voodi {
    private String stiil;
    private int padjad;
    private int tekid;
    private int lina;
    private double korgus;

    public Voodi(String stiil, int padjad, int tekid, int lina, double korgus) {
        this.stiil = stiil;
        this.padjad = padjad;
        this.tekid = tekid;
        this.lina = lina;
        this.korgus = korgus;
    }


    public String getStiil() {
        return stiil;
    }

    public int getPadjad() {
        return padjad;
    }

    public int getTekid() {
        return tekid;
    }

    public int getLina() {
        return lina;
    }

    public double getKorgus() {
        return korgus;
    }

    public void valmis() {
        System.out.println("Voodi -> valmis");
    }
}