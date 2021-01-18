public class Konto {
    // muutujad
    public String omanik;
    public Double bilans;
    // meetodid

    public void looKonto(String omanikuNimi, Double summa) {
        this.omanik = omanikuNimi;
        this.bilans = summa;
    }

    public boolean lisaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa, pole võimalik lisada");
            return false;
        } else {
            this.bilans = this.bilans + summa; // += summa;
            System.out.println("Kontole lisatud summa " + summa);
            return true;
        }
    }

    public boolean votaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa, pole võimalik võtta");
            return false;
        } else {
            if (summa <= this.bilans) {
                this.bilans = this.bilans - summa;
                System.out.println("Kontost võetud maha " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha");
                return false;
            }
        }
    }

    public boolean teeUlekanne(Konto teineKonto, Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivne summa, pole võimalik kanda");
            return false;
        } else {
            if (summa <= this.bilans) {
                this.bilans = this.bilans - summa;
                teineKonto.bilans = teineKonto.bilans + summa;
                System.out.println("Kantud üle " + summa);
                return true;
            } else {
                System.out.println("Ei ole piisavalt raha");
                return false;
            }
        }
    }

    public void lisaRahaSelgitus(boolean tegevus) {
        if (tegevus == true) {
            System.out.println("Raha on lisatud");
        } else {
            System.out.println("Raha ei ole lisatud - negatiivne summa");
        }
    }
}
