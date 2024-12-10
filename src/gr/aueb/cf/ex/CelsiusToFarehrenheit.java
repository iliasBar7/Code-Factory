package gr.aueb.cf.ex;

import java.util.Scanner;

public class CelsiusToFarehrenheit {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double celsius ;
        double farehrenheit = 0;

        System.out.println("Please insert a number (double) decimal for celsius : ");
        celsius = scanner.nextDouble();

         farehrenheit = celsiusToFarehrenheit(celsius);


        System.out.println("The conversion from celsius to farehrenheit is : " + farehrenheit);

    }

    public static double celsiusToFarehrenheit(double c){

        return (c * 9/5) + 32;
    }
}
