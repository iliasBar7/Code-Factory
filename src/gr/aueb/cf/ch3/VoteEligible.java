package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαιωμα ψηφου σε ηλικιες > 18
 * ελεγχει αν μια ηλικια εχει δικαιωμα να ωηφισει
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int VOTING_AGE = 18;
        boolean isEligible =false ;
        int age;


        System.out.println("Please insert your age (int)");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible " + isEligible);

    }
}
