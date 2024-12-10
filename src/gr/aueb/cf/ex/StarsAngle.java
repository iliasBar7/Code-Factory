package gr.aueb.cf.ex;

import java.util.Scanner;

public class StarsAngle {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);
        int num ;


        System.out.println("Please insert a number to display stars: " );

        num = console.nextInt();

        for (int i = 1; i <= num; i++){

            for(int j = num; j >= i; j--){



                System.out.print("*");

            } System.out.println();

        }


    }
}
