package gr.aueb.cf.exarrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetMinMaxValue {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {


            int size;
            System.out.println("How many items do you want to enter ? ");

            size = in.nextInt();
            if (size < 0 || size == 0) throw new Exception("You must not insert negative integers or zero value ");

            // Δημιουργία πίνακα με το μέγεθος που έδωσε ο χρήστης
            int[] arr = new int[size];

            // Ζητάμε από τον χρήστη να εισάγει τα στοιχεία του πίνακα
            System.out.println("Insert " + size + " numbers:");

            for (int i = 0; i < size; i++) {
                System.out.print("Item " + (i + 1) + ": ");
                arr[i] = in.nextInt();
            }

            int minValue = arr[0];
            int maxValue = arr[0];


            for (int j : arr) {

                if (j < minValue) {

                    minValue = j;


                }
                if (j > maxValue) {
                    maxValue = j;
                }
            }
            System.out.println("The minimum value of the array is " + minValue);
            System.out.print("The maximum value of the array is " + maxValue);


        } catch (InputMismatchException e) {
            System.out.println("Please insert integer and not String value !!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

