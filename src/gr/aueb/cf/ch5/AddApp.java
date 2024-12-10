package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα 2 ακεραιων
 * με την χρηση μεθοδων.
 */
public class AddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int sum = 0;
        int sub = 0;

        System.out.println("Please enter two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = AddApp.add (a,b);
        sub= AddApp.sub (a, b);

        System.out.println(sum);
        System.out.println(sub);

    }

    /**
     * add two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the sum of two integers
     */

    public static int add (int a, int b) {
//        int result = 0;
//        result = a + b ;
//
//        return result;
        return a + b;
    }

    /**
     * subtracts two integers
     * @param a the first integer to subtract from.
     * @param b the second integer that is sub tracted
     * @return the subtraction of a-b.
     */

    public static int sub ( int a, int b) {
        return  a - b;
    }
}
