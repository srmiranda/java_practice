package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        // entire above line is a Statement
        myVariable++;
        myVariable--;

        System.out.println("This is a test.");
        // Also a complete Statement

        System.out.println("This is" +
                " another " +
                "still more.");
        // Allowed to break up methods or statements

        int anotherVariable = 5; myVariable--; anotherVariable++;
        System.out.println("This is another one.");
        // Can put the on the same line, but best to make it clear.
    }
}
