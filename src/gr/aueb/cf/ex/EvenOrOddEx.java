package gr.aueb.cf.ex;

import java.util.Scanner;

public class EvenOrOddEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Δώστε μου εναν αριθμό");
        num = scanner.nextInt();

        if (num % 2 == 0 ){
            System.out.println("'Αρτιος");
        }else if (num % 2 != 0){
            System.out.println("Περιττός");
        }
    }
}
