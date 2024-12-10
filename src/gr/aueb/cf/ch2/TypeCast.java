package gr.aueb.cf.ch2;

public class TypeCast {
    /**
     * Typecast demo.
     */
    public static void main(String[] args) {
        int num1 = 10; //int literals  --->int ->32-bit
        long num2 = 20L; //with L promoted to long from int Typecast promote

        num1 = (int) num2;
    }
}
