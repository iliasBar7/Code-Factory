package gr.aueb.cf.ch1;

import java.util.Scanner;

public class EurosApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amount;
        int euros500, euros100, euros50, euros20, euros10, euros1;

        System.out.println("Παρακαλώ εισάγετε το ποσό ανάληψης (σε Ευρώ):");
        amount = in.nextInt();

        if (amount <= 0) {
            System.out.println("Το ποσό πρέπει να είναι θετικό.");
            in.close();
            return;
        }

        // Υπολογισμός χαρτονομισμάτων
        euros500 = amount / 500;
        amount %= 500;

        euros100 = amount / 100;
        amount %= 100;

        euros50 = amount / 50;
        amount %= 50;

        euros20 = amount / 20;
        amount %= 20;

        euros10 = amount / 10;
        amount %= 10;

        euros1 = amount; // Ό,τι μένει είναι νομίσματα των 1 ευρώ

        // Εμφάνιση αποτελεσμάτων
        System.out.printf("Για την ανάληψη σας χρειάζεστε:\n");
        System.out.printf("Χαρτονομίσματα των 500 ευρώ: %d\n", euros500);
        System.out.printf("Χαρτονομίσματα των 100 ευρώ: %d\n", euros100);
        System.out.printf("Χαρτονομίσματα των 50 ευρώ: %d\n", euros50);
        System.out.printf("Χαρτονομίσματα των 20 ευρώ: %d\n", euros20);
        System.out.printf("Χαρτονομίσματα των 10 ευρώ: %d\n", euros10);
        System.out.printf("Νομίσματα των 1 ευρώ: %d\n", euros1);

        in.close(); // Κλείσιμο του scanner
    }
}
