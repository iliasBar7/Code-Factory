package gr.aueb.cf.ex;

import java.util.Scanner;

/**
 * Γράψε ένα πρόγραμμα που να ζητά από τον χρήστη να εισάγει έναν αριθμό και να ελέγχει αν ο αριθμός είναι θετικός ή αρνητικός.
 * Αν είναι θετικός, να εκτυπώνει το μήνυμα "Θετικός αριθμός",
 * διαφορετικά "Αρνητικός αριθμός".
 * Το πρόγραμμα πρέπει να επαναλαμβάνεται τουλάχιστον μία φορά και να συνεχίζεται όσο ο χρήστης εισάγει αριθμούς διαφορετικούς από το 0.
 */

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num =0;

        do {
            System.out.println("Δώσε μου εναν αριθμό");
            num = scanner.nextInt();
            if (num < 0){
                System.out.println("Αρνητικός αριθμός");
            }else if (num > 0){
                System.out.println("Θετικός αριθμός");
            }

        }while(num != 0);
    }
}
