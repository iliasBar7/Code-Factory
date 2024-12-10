package gr.aueb.cf.ch1;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        // Declaration of variables
        Scanner in = new Scanner(System.in);
        int num1 ,num2, sum;


       //Commands
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 =in.nextInt();

        sum = num1 + num2;

        //Prints the result
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.printf("Το άθροισμα των %d kai %d ειναι ισο με %d",num1, num2, sum);


    }
}
