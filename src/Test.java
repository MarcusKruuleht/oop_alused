import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Sodur> armee1 = new ArrayList<>();
        ArrayList<Sodur> armee2 = new ArrayList<>();


        for (int kord = 1; kord <= 20; kord++) {
            int armeeNr = (int) Math.round(Math.random() * 2);
            if (armeeNr == 1) {
                armee1.add(new Sodur(armeeNr));
            }
            if (armeeNr == 2) {
                armee2.add(new Sodur(armeeNr));
            }

        }

        for (Sodur sodur : armee1) {
            sodur.info();
        }
        for (Sodur sodur : armee2) {
            sodur.info();
        }
    }
}