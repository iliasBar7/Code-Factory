package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * o χρήστης θα δίνει το πλήθος των Stars
 * και θα βγάζει αποτέλεσμα n οριζοντια Stars
 */

public class HorizontalStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert a number (integer) for Stars: ");

        n = scanner.nextInt();

        for (int i = n; i <= n; i++) {



            System.out.println("*");

        }

    }
}
