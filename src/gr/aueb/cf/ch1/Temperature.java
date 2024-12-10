package gr.aueb.cf.ch1;

import java.util.Scanner;

/**
 * Converts fahrenheit to celsius using Scanner utility
 * Prints the Standard output.
 * Prints and prompts the user to convert fahrenheit to celsius whenever the user gives an integer.
 * @author Ilias
 */

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Εισαγωγή θερμοκρασίας σε Φαρενάιτ
        System.out.print("Εισάγετε την θερμοκρασία σε Φαρενάιτ: ");
        int fahrenheit = in.nextInt();

        // Μετατροπή σε Κελσίου
        int celsius = ((fahrenheit - 32) * 5) / 9;

        // Εμφάνιση αποτελέσματος
        System.out.printf("Η θερμοκρασία σε Κελσίου είναι: %d", celsius);


    }
}













