package gr.aueb.cf.ch1;


import java.util.Scanner;

public class TestDateMonthYear {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("Εισάγετε την ημερομηνία σε τρεις ακέραιους αριθμούς:");

        //declaration
        int date = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();



        System.out.printf("%02d/%02d/%02d%n", date, month, year % 100);

            in.close();

    }
}
