import java.util.Scanner;

/*
 * autor - Anna Karutina
 * ülesanne 3.1
 * */
public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale, mida sisestada
        System.out.println("Sisesta mitu korda tuleb äratada:  ");
        // salvestame kasutaja sisestatud väärtus
        int mituKorda = sisend.nextInt();
        // korduv tegevus
        // defineerime tsükli juhtimismuutuja
        int kord = 1;
        // kontroll
        while (kord <= mituKorda) {
            System.out.println("Tõuse ja sära");
            // juhtimismuutuja väärtuse suurendamine
            kord++; // sama, mis kord += 1
        }
        System.out.println();
    }
}
