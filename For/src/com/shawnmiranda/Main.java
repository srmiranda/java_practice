package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {

//        // using the for statement, call the calculateInterest method with
//        // the amount of 10,000 with an interestRate of 2, 3, 4, 5, 6, 7 and 8
//        // and print the result to the console window
//
//        for(int x=2; x<9; x++) {
//            System.out.println("$10,000 at " + x + "% interest = "
//                    + calculateInterest(10000.0, x));
//        }
//
//        for(int i=1; i<6; i++) {
//            System.out.println("Loop " + i + " hello!");
//        }
//
//        // How would you modify the for loop above to do the same thing as
//        // shown but to start from 8% and work back to 2%
//
//        for(int i=8; i>=2; i--) {
//            System.out.println("$10,000 at " + i + "% interest = "
//                    + calculateInterest(10000.0, i));
//        }
//

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3, exit the for loop
        // hint: Use the break; statement to exit
        int count = 0;

        for(int i=10; i<=100; i++) {
            if (isPrime(i)) {
                System.out.println("Prime number: " + i);
                count++;
            }
                if (count == 3) {
                    System.out.println("Exiting...");
                    break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }

        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double intrestRate) {
        return (amount * intrestRate/100.0);
    }
}
