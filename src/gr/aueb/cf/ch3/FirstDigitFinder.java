package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρισκει το πρωτο αριστερα ψηφιο ενος ακεραιου
 */
public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int leftDigit = 0;
        int tempNum = 0;


        System.out.println("Enter a positive number");
        inputNum = scanner.nextInt();
        tempNum = inputNum;

        while(tempNum >= 10){
            tempNum /= 10;

       }

        System.out.println("The first digit of " + inputNum + " is " +  tempNum);
    }
}
