package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */
public class BicentennialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        boolean isBicentennialYear = false;

        do {
            System.out.println("Please insert the year ");
            year = scanner.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                isBicentennialYear = true;
                System.out.println("Ειναι  Δίσεκτο έτος " + isBicentennialYear);
            } else {
                System.out.println("Δεν είναι Δίσεκτο έτος " + isBicentennialYear);
            }
        } while (!isBicentennialYear);


        }


    }






                