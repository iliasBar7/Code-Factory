package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα φώτα
 * ενός αυτοκινήτου με βάση τρεις μεταβλητές:
 * αν βρέχει ΚΑΙ ταυτόχρονα ισχύει ένα τουλάχιστον
 * απ'ο τα επόμενα:είναι σκοτάδι Η΄ τρέχουμε
 * (speed> 100). Τις τιμές αυτές τις λαμβάνουμε
 * απο τον χρήστη
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining;
        boolean isDark;
        final int  MAX_SPEED = 100;
        int speed = 0;

        System.out.println("Please insert  if it is raining: true / false");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark outside true / false ");
        isDark = in.nextBoolean();

        System.out.println("Please insert the speed (int)");
        speed = in.nextInt();

        if (isRaining && (isDark || speed > MAX_SPEED)) {
            System.out.println("Lights On ");
        }

        else{
                System.out.println("Lights Off ");
            }
        }


        }




