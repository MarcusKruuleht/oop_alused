/*
 * meetod + return
 * autor - Marcus Kruuleht
 * ülesanne
 * */


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int[] vastuvõetud = {2803, 2626, 2359, 1927, 2236, 2281, 2394, 2484, 2468};
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta aasta: ");
        int aasta = sisend.nextInt();
        int massiiviindeks = aasta - 2011;
        System.out.println("Vastuvõetud on " + vastuvõetud[massiiviindeks]);

    }
}
