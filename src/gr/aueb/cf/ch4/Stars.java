package gr.aueb.cf.ch4;

/**
 * prints differnt outputs of stars.
 */

public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print("*");
        }

        for (int i = 1; i <= 10; i++ ) {
            System.out.println("*");
        }

        for ( int i = 1; i <=10; i++) {
            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 1st row : 1star
        //2nd row " 2 stars
        //3rd row : 3 stars ,etc

        //Ascending
        for (int i = 1;  i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        //Descending
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {
                System.out.println("*");

            }
            System.out.println();
        }


    }
}
