/*
 * autor - Marcus Kruuuleht
 * ülesanne 5.4c
 * */

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


public class test {
    public static void main(String[] args) {

        // massiiv faili sisu hoidmiseks

        ArrayList<String> opilased = new ArrayList<>();

        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed

        File fail = new File("C:\\Users\\marcus\\IdeaProjects\\oop_alused\\src\\nimekiri.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }

        // loeme failist

        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            opilased.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // loome tänase kuupäeva
        LocalDateTime tananeKuupev = LocalDateTime.now();
        System.out.println("Täane kuupäev ilma vorminguseta " + tananeKuupev);
        DateTimeFormatter tananeKuupaevVormindus = DateTimeFormatter.ofPattern("dd");
        String tananeKuupaevVormindatud = tananeKuupev.format(tananeKuupaevVormindus);
        System.out.println("Tänane vormintatud kuupäev " + tananeKuupaevVormindatud);
        // otsime vajalik inimene nimekirjast
        int indeks = Integer.parseInt(tananeKuupaevVormindatud);
        System.out.println(opilased.get(indeks - 1));
        // vaatame nimekirja sisu

        /*
        for (int i = 0; i < opilased.size(); i++) {
            System.out.println(i + " " + opilased.get(i));
         */


    }
}