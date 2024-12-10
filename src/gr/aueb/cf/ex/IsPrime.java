package gr.aueb.cf.ex;

import java.util.Scanner;



public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean isPrime;

        System.out.println("Please insert a number to check:");
        num = scanner.nextInt();

        // Κλήση της μεθόδου για έλεγχο αν ο αριθμός είναι πρώτος
        isPrime = isPrime(num);

        System.out.println("The number " + num + " is prime: " + isPrime);
    }

    public static boolean isPrime(int num) {
        // Έλεγχος για αριθμούς μικρότερους ή ίσους του 1 (δεν είναι πρώτοι)
        if (num <= 1) {
            return false;
        }

        // Έλεγχος για διαιρέτες από το 2 μέχρι το √num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // Ο αριθμός έχει διαιρέτη, δεν είναι πρώτος
            }
        }

        // Αν δεν βρέθηκε διαιρέτης, τότε είναι πρώτος
        return true;
    }
}

