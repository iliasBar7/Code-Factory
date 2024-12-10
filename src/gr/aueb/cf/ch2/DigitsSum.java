package gr.aueb.cf.ch2;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Να λαμβάνει ως Input απο τον χρηστη  ενα
 * διψηδιο ακεραιο και να υπολογιζει και να
 * υπολογιζει τ αθροισμα των ψηφιων του
 * Για παραδειγμα , αν ο χρηστης δωσει τον αριμο 15
 * θα πρεπει το αποτελεσμα να ειναι
 * 1+5=6
 */

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;

        System.out.println("Please input the two-digit interger");
        inputNum=in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("%d + %d = %d", leftDigit, rightDigit, sum);

    }
}
