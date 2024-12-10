package gr.aueb.cf.ch5;

import java.util.Scanner;

import static gr.aueb.cf.ch5.MenuApp.isChoiceValid;

/**
 * Εμφανιζει ενα μενου επιλογων (1.προσθεση. 2 αφαιρεση)
 * ο χρηστης επιλεγει
 * αναλογα με την επιλογη εκτελειται η αντιστοιχη πράξη
 * λαι εκτυπωνετε το αποτελεσμα
 * εκτελειθται επανληπικα μεχρι ο χρηστης να επιλεξει εξοδο
 */

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result = 0;


        while (true){
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)){
                System.out.println("Error. Choice must be between 1-6. Try again.");
                continue;
            }
            if (choice == 6) {
                System.out.println("'Εξοδος...");
                break;
            }

            result = getResultonChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu(){
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1.Προσθεση");
        System.out.println("2. Αφαιρεση");
        System.out.println("3. πολλαπλασιασμος");
        System.out.println("4. Διαιρεση");
        System.out.println("5. Υπολοιπο Διαιρεσης");
        System.out.println("6. Eξοδος");
    }
    public static int getOneInt(){
        return scanner.nextInt();

    }

    public static boolean isChoiceValid(int choice){
//        if (choice >= 1 && choice <= 6){
//            return true;
//        }else {
//            return false;
//        }
           return choice >= 1 && choice <= 6;
    }

    public static int getResultonChoice(int choice){
        int num1 =0;
        int num2 = 0;
        int result =0;
        System.out.println("Παρακαλώ εισαγετε δυο ακεραιους");
        num1 = getOneInt();
        num2 = getOneInt();

        switch (choice){
            case 1:
                result = add(num1,num2);
                break;
            case 2:
                result = sub(num1,num2);
                break;
            case 3:
                result = mul(num1,num2);
                break;
            case 4:
                result = div(num1,num2);
                break;
            case 5:
                result = mod(num1,num2);
                break;
            default:
                System.out.println("Error in choice");
                break;
        }
        return result;
    }

    public static int add (int a,int b){
        return a+b;
    }
    public static int sub (int a, int b){
        return a - b;
    }
    public static int mul (int a, int b){
        return a * b;
    }
    public static int div ( int a, int b){
        if (b == 0) return 0;
        return a /b ;
    }
    public static int mod (int a, int b){
        if (b == 0) return 0;
        return a % b;
    }
}
