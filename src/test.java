import java.util.Scanner;

/*
 * Muutujate kasutamise näide
 * autor - Anna Karutina
 * ülesanne 1.3
 * */
public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage astme alus");
        // salvestame kasutaja sisestatud väärtus
        int asmeAlus = sisend.nextInt();
        // selgitame kasutajale, mida tuleb sisestada
        System.out.println("Sisestage astendaja");
        //salvestame kasutaja sisestatud väärtus
        int astendaja = sisend.nextInt();
        // arvutamine
        int tulemus = (int) Math.pow(asmeAlus, astendaja);
        // väljastamine
        System.out.println(tulemus);
    }
}
