import java.util.Scanner;

/**
 * o χρηστης θα δινει 1. τους συνολικους βαθμους μαθημάτων
 * Αριστα αν ο μεσος όρος ειναι >=9, πολύ καλά αν
 * ο μέσος όρος ειναι >= 7 και Καλώς αν ο μέσος όρος ειναι  >=5
 * και Αποτυχία αν ο μορος ειναι <5
 */
public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks;
        int coursesCount;
        int average;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks<=0){
            System.out.println("Total mars must not be zero");
            System.exit(1);
        }

        System.out.println("Please insert courses count.");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0){
            System.out.println("Courses must not be negative or zero");
            System.exit(1);
        }
        average = totalMarks /coursesCount;

       if (average > 10){
           System.out.println("Error. The average must be less or equal than 10.");
           System.exit(1);
       }

       if (average >= 9){
           System.out.println("Excellent");
       } else if (average >= 7){
           System.out.println("Very Good");
       } else if (average >= 5){
           System.out.println("Good");
       } else {
           System.out.println("failure");
       }
    }
}
