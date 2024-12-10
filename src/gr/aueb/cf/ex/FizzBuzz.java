package gr.aueb.cf.ex;

public class FizzBuzz {
    public static void main(String[] args) {
        // Βρόχος από 1 μέχρι 100
        for (int i = 1; i <= 100; i++) {
            // Έλεγχος αν ο αριθμός είναι πολλαπλάσιο και του 3 και του 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Έλεγχος αν ο αριθμός είναι πολλαπλάσιο του 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Έλεγχος αν ο αριθμός είναι πολλαπλάσιο του 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Αν δεν είναι πολλαπλάσιο ούτε του 3 ούτε του 5, εκτύπωσε τον αριθμό
            else {
                System.out.println(i);
            }
        }
    }
}




