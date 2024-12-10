package gr.aueb.cf.ex;

import java.util.Scanner;

public class StarPatternApp {

    // Μέθοδος για την εκτύπωση n αστερίσκων οριζόντια
    public static void printHorizontalStars(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        System.out.println();  // Αλλαγή γραμμής μετά την εκτύπωση των αστερίσκων
    }

    // Μέθοδος για την εκτύπωση n αστερίσκων κάθετα
    public static void printVerticalStars(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
    }

    // Μέθοδος για την εκτύπωση n γραμμών με n αστερίσκους
    public static void printSquareStars(int num) {
        for (int i = 1; i <= num; i++) {
            printHorizontalStars(num);  // Καλούμε την printHorizontalStars για να εκτυπώσουμε κάθε γραμμή
        }
    }

    // Μέθοδος για την εκτύπωση n γραμμών με αστερίσκους 1 έως n
    public static void printIncrementalStars(int num) {
        for (int i = 1; i <= num; i++) {
            printHorizontalStars(i);  // Καλούμε την printHorizontalStars για να εκτυπώσουμε αστερίσκους στην i-τη γραμμή
        }
    }

    // Μέθοδος για την εκτύπωση n γραμμών με αστερίσκους n έως 1
    public static void printDecrementalStars(int num) {
        for (int i = num; i >= 1; i--) {
            printHorizontalStars(i);  // Καλούμε την printHorizontalStars για να εκτυπώσουμε αστερίσκους στην i-τη γραμμή
        }
    }

    // Μέθοδος για την εκτύπωση του μενού και την επεξεργασία της επιλογής του χρήστη
    public static void displayMenu() {
        System.out.println("Δώστε μία επιλογή:");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστερίσκους");
        System.out.println("4. Εμφάνισε n γραμμές με αστερίσκους 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστερίσκους n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    // Κύρια μέθοδος που τρέχει το πρόγραμμα
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;  // Για να αποθηκεύσουμε την επιλογή του χρήστη
        int num;  // Ο αριθμός για τα αστεράκια

        // Το πρόγραμμα τρέχει μέχρι ο χρήστης να επιλέξει την επιλογή 6
        do {
            // Εμφάνιση μενού και λήψη επιλογής από τον χρήστη
            displayMenu();
            System.out.print("Επιλογή: ");
            choice = scanner.nextInt();  // Ανάγνωση της επιλογής

            if (choice != 6) {
                System.out.print("Δώστε αριθμό για αστεράκια: ");
                num = scanner.nextInt();  // Ανάγνωση του αριθμού για τα αστεράκια

                switch (choice) {
                    case 1:
                        printHorizontalStars(num);
                        break;
                    case 2:
                        printVerticalStars(num);
                        break;
                    case 3:
                        printSquareStars(num);
                        break;
                    case 4:
                        printIncrementalStars(num);
                        break;
                    case 5:
                        printDecrementalStars(num);
                        break;
                    default:
                        System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
                }
            }
        } while (choice != 6);  // Το πρόγραμμα τερματίζεται όταν επιλεγεί η επιλογή 6

        System.out.println("Έξοδος από το πρόγραμμα.");
        scanner.close();
    }
}







