package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Snowing if raining AND temp < 0
 * Αποφασίζει αν χιονίζει η οχι , με βάση την θερμοκρασία
 * αλλά και το αν βρέχει / Αν βρεχει kai η θερμοκρασία
 * είναι < 0 . τοτε χιονίζει , αλλιως οχι.
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp;
        boolean isRaining;
        boolean isSnowing;

        System.out.println("Please insert if it is raining true/false");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the temp(int)");
        temp = in.nextInt();


        isSnowing =  isRaining && (temp < 0);
        System.out.println("Is snowing " + isSnowing);

    }


}
