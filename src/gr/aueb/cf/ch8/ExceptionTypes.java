package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionTypes {

    public static void main(String[] args) {


    }

    /**
     * System.in.read() thows IOException.
     * since a checked exception is thrown,it has
     * to be explicitly to be thrown in method signature .
     * Or has to be caught {}
     * When this type of method / exception may be used?
     * when no need to handle the exception.
     * is this meaningfull ? No. idealy , we want to handle
     * exceptions, not only propagate .
     * @return
     * @throws IOException
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    /**
     * if we catch the exception, no need for 'throws'
     * in method signature.And the exception not propagates.
     * is it a good practise , not to propagate?
     * it depends ,If there is  a caller ,then we have to propagate.
     * If there is  a client / user then we dont propagate the
     * exception.
     * @return
     */
    public static char readAnotherChar(){
        try {
            return (char) System.in.read();

        }catch (IOException exception) {
            System.err.println(exception.getMessage());
            return ' ';
        }
    }

    /**
     * IS THIS type of method /exception, we take
     * action --loging , and also rethrow the exception
     * to propagate to the caller .
     * @return
     * @throws IOException
     */
    public static char readAnotherOneChar() throws IOException, IllegalArgumentException{
        try {
            return (char) System.in.read();

        }catch (IOException exception) {
            System.err.println(exception.getMessage());
            throw exception;
        }
    }

    public static char readAgainOneChar(char ch) throws IOException {
        try {
            char inputChar = (char) System.in.read();
            if (inputChar != ch) throw new IllegalArgumentException("char not fit");
            return inputChar;
        }catch (IOException | IllegalArgumentException e){
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;

        }
//        }catch(IllegalArgumentException ex1) {
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        }catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }
    }
}

