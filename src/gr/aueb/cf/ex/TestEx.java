package gr.aueb.cf.ex;

public class TestEx {
    public static void main(String[] args) {
        char ch = '!';
        switch (ch) {
            case 'H':
            case '*':
            case '!':
            case '&':
                System.out.println("Hello");
                break;
            default:
                System.out.println("Adios");
                break;
        }

    }
}
