package gr.aueb.cf.ch10;

import java.util.Scanner;




    public class SimpleBank {
        static double balance = 500;
        static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {

            try {
                deposit(in.nextInt());

            }catch (Exception e) {
                System.out.println("An error happened. Try again...");//μιλαει με χρηστη δινει ενα μυνημα
            }
        }

        public static void deposit(double amount) throws Exception{
            try {
                if (amount <= 0) {
                    throw new Exception("Error. Amount. " +amount + "must not be negative or zero.");

                }
                balance += amount;
                System.out.println("Successfully deposited:" + amount); // log
            }catch (Exception e){
                System.err.println("Error." + e.getMessage()); //log
                throw e;
            }
        }
    }

