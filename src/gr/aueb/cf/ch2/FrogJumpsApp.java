package gr.aueb.cf.ch2;

/**
 * X =10
 * Y=85
 * D=30
 * jumps = 3
 * 10+30 = 40
 * 40+30=70
 * 70+30=100
 *
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        //calculate jumps
       jumps = (int) Math.ceil((target - start)/ (double) hop); //whenever a variable typecast to double the whole calculation and variable promotes to double.
        System.out.println("Jumps: " + jumps);
    }
}
