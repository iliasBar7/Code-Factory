package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuAppEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        do {

            System.out.println("1. Εισαγωγή.");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            System.out.println("Παρακαλω εισαγετε εναν αριθμο: ");
            num = scanner.nextInt();
            if (num == 1){
                System.out.println("Επιλέξατε Εισαγωγή.");
            } else if (num == 2){
                System.out.println("Eπιλέξατε Διαγραφή. ");
            } else if (num == 3){
                System.out.println("Eπιλέξατε Ενημέρωση. ");
            } else if (num == 4){
                System.out.println("Eπιλέξατε Αναζήτηση. ");
            }else if (num == 5){
                System.out.println("Επιλέξατε έξοδο ");
            }else {
                System.out.println("Παρακαλω εισαγετε εναν αριθμο απο το 1-5. ");

            }

        } while( num > 0 && num < 5);

    }
}
