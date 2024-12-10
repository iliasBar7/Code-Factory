package gr.aueb.cf.ex;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        final int MAX_VALUE;

        System.out.println("Please insert three number to get the max value: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        MAX_VALUE = findMax(num1,num2,num3);

        System.out.println("The maximum value of the three integers is " + MAX_VALUE);

    }
    public static int findMax(int a , int b , int c){
        return Math.max( a, Math.max(b,c));
    }
}
