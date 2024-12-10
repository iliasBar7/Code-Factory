package gr.aueb.cf.ex;

import java.util.Scanner;

public class SquareMethod {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int result = 0;

        System.out.println("Please insert an integer number: ");

        num = scanner.nextInt();

        result = square(num);

        System.out.println("The square of " + num + " is " + result);



    }

    public static int square(int base ){
        return base * base;




    }
}
