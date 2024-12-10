package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
//            System.out.println("Επιλέξτε ενα απο τα παρακάτω: ");
//            System.out.println("1. One-player game");
//            System.out.println("2. two-player");

            switch (choice) {
                case 1:
                    System.out.println("One-player game started");
                    break;
                case 2 :
                    System.out.println("two-player game started");
                    break;
                case 3:
                    System.out.println("Team game started");
                    break;
                case 4:
                    System.out.println();
                    break;
                default:
                    System.out.println("Error in choice");
                    break;
            }

        } while (choice != 4);
    }
}
