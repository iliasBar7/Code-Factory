package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * YΥπολογιζει το αθροισμα των ωηφιων ενος ακεραιου
 * Για παράδειγμα , το αθροισμα του 123 ειναι 6
 */

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit;

        System.out.println("Enter a positive integer");
        inputNum = scanner.nextInt();

        //toDo
        tempNum = inputNum;
        while(tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;
            tempNum /= 10;


        }



        System.out.println("The sum of digits of " + inputNum + " is " + sum);
    }
}
