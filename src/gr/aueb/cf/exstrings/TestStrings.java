package gr.aueb.cf.exstrings;

import java.util.Scanner;

public class TestStrings {
    public static void main(String[] args) {

                // Δοκιμαστική συμβολοσειρά προς κρυπτογράφηση
                String input = "Hello World!";

                // Κρυπτογράφηση της συμβολοσειράς
                String encryptedString = encrypt(input);

                // Εκτύπωση του αποτελέσματος
                System.out.println("Original String: " + input);
                System.out.println("Encrypted String: " + encryptedString);
            }

            // Μέθοδος για κρυπτογράφηση της συμβολοσειράς
            public static String encrypt(String str) {
                StringBuilder encrypted = new StringBuilder();

                // Διατρέχουμε κάθε χαρακτήρα της συμβολοσειράς
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);

                    // Αυξάνουμε τον ASCII κωδικό του χαρακτήρα κατά 1 η μειωνουμε !
                    char previousChar = (char) (c - 1);

                    // Προσθέτουμε το νέο χαρακτήρα στο StringBuilder
                    encrypted.append(previousChar);
                }

                // Επιστρέφουμε την κρυπτογραφημένη συμβολοσειρά
                return encrypted.toString();
            }
        }






