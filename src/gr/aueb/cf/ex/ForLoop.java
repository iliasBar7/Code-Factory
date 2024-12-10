package gr.aueb.cf.ex;

/**
 * Γράψε ένα πρόγραμμα που να εκτυπώνει τους αριθμούς
 * από το 1 έως το 10,
 * αλλά αν ο αριθμός είναι ζυγός, να εκτυπώνει επίσης το μήνυμα "Ζυγός".
 */

public class ForLoop {
    public static void main(String[] args) {

        for(int i = 1; i<=10; i++ ){
           System.out.print(i);
            if (i % 2 == 0){

                System.out.print(" Ζυγός");
            }
            System.out.println();
        }
    }
}
