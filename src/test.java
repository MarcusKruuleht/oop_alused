import java.util.Scanner;

/*
 * autor - Marcus Kruuleht
 * ülesanne 3.2
 * */
public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida sisestada
        System.out.println("Sisestage ringide arv: ");
        // salvestame kasutaja sisestatud väärtus
        int ringideArv = sisend.nextInt();
        int porgandid = 0;
        int ring = 1;
        // korduv tegevus
        // kontroll
        while (ring <= ringideArv) {
            if (ring % 2 == 0) {
                porgandid = porgandid + ring;
            }
            ring = ring + 1;
        }
        System.out.println("Porgandite koguarv on " + porgandid + ".");
    }
}
