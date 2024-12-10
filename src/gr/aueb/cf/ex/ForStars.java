package gr.aueb.cf.ex;

import java.util.Scanner;

public class ForStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;


        System.out.println("Please insert the number of stars(integer): ");

        num = scanner.nextInt();


        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){

                System.out.print("*");
            }
            System.out.println();


        }





    }
}
