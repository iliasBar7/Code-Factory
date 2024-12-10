package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class demo.
 */
public class BigIntApp {
    public static void main(String[] args) {
        //Declarations and Initializations
        BigInteger bigNum1 = new BigInteger("123456789987654329999000");
        BigInteger bigNum2 = new BigInteger("234567899655555555555555");
        BigInteger result;

        result = bigNum1.add(bigNum2);


        System.out.printf("%,d", result);
    }
}
