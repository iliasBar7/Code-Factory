package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;
        int result = 0;

        System.out.println("Please insert a integer");
        inputNum = in.nextInt();

        while(i <= 10){
            System.out.println( inputNum + " * " );

            i++;
        }
    }
}
