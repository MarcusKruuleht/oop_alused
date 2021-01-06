import java.util.Scanner;

/*
 * autor - Marcus Kruuleht
 * ülesanne 3.4b
 * */
public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        int lumivalgekeseOunad = 14;
        // selgitame kasutajale, mida sisestada
        System.out.println("Mitu pöialpoissi tahab õunu?: ");
        // salvestame kasutaja sisestatud väärtus
        int poialpoisideOunad = sisend.nextInt();
        int poialpoiss = 1;
        while (poialpoiss <= poialpoisideOunad) {
            int ounad = (int) Math.round((Math.random() + 1) * 1);
            System.out.println(ounad);
            lumivalgekeseOunad = lumivalgekeseOunad - ounad;
            poialpoiss = poialpoiss + 1;
        }
        System.out.println("Lumivalgekesele jäi " + lumivalgekeseOunad);
    }
}
