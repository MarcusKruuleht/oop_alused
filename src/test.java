import java.util.Scanner;

/*
 * autor - Marcus Kruuleht
 * ülesanne 1.4b
 * */
public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);

        String nimi;
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage oma nimi ");
        nimi = sisend.nextLine();

        System.out.println("Sisestage lubatud kiirus (km/h) ");
        // salvestame kasutaja sisestatud väärtus
        int lubatudKiirus = sisend.nextInt();

        System.out.println("Sisestage tegelik kiirus (km/h) ");
        int tegelikKiirus = sisend.nextInt();

        // kontroll
        if (tegelikKiirus <= lubatudKiirus) {
            System.out.println(nimi + ", teil ei ole trahvi");
        } else {
            int kiirus = tegelikKiirus - lubatudKiirus;
            int trahv = kiirus * 3;


            String lause = nimi + ", kiiruse ületamise eest on teie trahv " + trahv + " eurot";

            System.out.println(lause);
        }
    }
}
