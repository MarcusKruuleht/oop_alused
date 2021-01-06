import java.util.Scanner;

/*
 * autor - Marcus Kruuleht
 * ülesanne 2.3c
 * */
public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        System.out.println("Inimeste arv: ");
        int inimesed = sisend.nextInt();
        System.out.println("Kohtade arv: ");
        int kohad = sisend.nextInt();
        int buss = inimesed / kohad;
        int jaak = inimesed % kohad;

        if (inimesed - kohad * buss != 0) {
            System.out.println("Busse vaja: " + (buss + 1));
        } else if (buss > 0) {
            System.out.println("Busse vaja: " + buss);
        }

        if (inimesed == 0) {
            System.out.println("Viimases bussis inimesi: 0");
        } else if (jaak == 0) {
            System.out.println("Viimases bussis inimesi: " + kohad);
        } else {
            System.out.println("Viimases bussis inimesi: " + jaak);
        }
    }
}
