import java.util.Scanner;

/*
 * meetod + return
 * autor - Marcus Kruuleht
 * ülesanne 6.3
 * */

public class test {
    // eelarve meetod
    static int eelarve(int külalised) {
        int arve = (külalised * 10 + 55);
        return arve;
    }

    // main meetod
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        //selgitame kasutjale, mida tuleb sisestafa
        System.out.println("Mitu külalist on kutsutud? ");
        // salvestame kasutaja sisestatud väärtus
        int kutsutudKülalised = sisend.nextInt();
        // arvutamine
        System.out.println("Mitu inimest tuleb? ");
        int tulemasKülalised = sisend.nextInt();

        System.out.println("Maksimaalne eelarve: " + eelarve(kutsutudKülalised) + " eurot");
        System.out.println("Minimaalne eelarve: " + eelarve(tulemasKülalised) + " eurot");

    }
}
