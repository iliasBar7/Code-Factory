package gr.aueb.cf.ex;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 10;
        int sum = 0;

        for(int i = 1; i <= num; i++ )
            sum += i;
        System.out.println("The natural sum is: "+ sum);

    }
}
