package gr.aueb.cf.ch1;

public class AddApp {
    /**
     *Calculates the sum of two integers
     * and the result is printed at console
     * (standard output).
     * @
     */


    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση Μεταβλητών
        int num1 = 5 ;
        int num2 = 12;
        int result = 0;

        //Εντολές
        result = num1 +num2 ;

        //Εκτύπωση του αποτελέσματος
        System.out.println("To αποτέλεσμα ειναι: " + result);
        System.out.println("Το άθροισμα των " + num1 + ", " + num2 + " είναι ίσο με: " + result );
        System.out.printf("To άθροισμα των %d, %d είναι ίσο με: %d\n", num1, num2, result);
    }
}