import java.util.Scanner;

/*
 * meetod + return
 * autor - Marcus Kruuleht
 * ülesanne 6.4a
 * */

public class test {

    // eelarve meetod


    // main meetod
    public static void main(String[] args) {
        int kord = 1;
        int jk = 1;
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        //selgitame kasutjale, mida tuleb sisestafa
        System.out.println("Sisestage külaliste arv: ");
        // salvestame kasutaja sisestatud väärtus
        int külalisteArv = sisend.nextInt();
        while (külalisteArv >= kord) {
            System.out.println("Võõrustaja: \"Tere!\"");
            System.out.println("Täna " + jk + ". " + "kord tervitada, mõtiskleb võõrustaja.");
            System.out.println("Külaline: \"Tere, suur tänu kutse eest!\"");
            jk++;
            kord++;


        }


    }
}
