package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the Price with vat
 */
public class PriceWithVat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double inputPrice;
        double priceWithVat;
        double vat ;
        final double VAT_RATE = 0.24 ;

        System.out.println("Please insert the price");

        inputPrice = in.nextDouble();
        vat = inputPrice * VAT_RATE;
        priceWithVat = inputPrice + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inputPrice, vat, priceWithVat);





    }
}
