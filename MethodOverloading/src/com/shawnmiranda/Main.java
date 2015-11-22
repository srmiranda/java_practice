package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
        calculateScore("Shawn", 500);
        calculateScore(750);
        calculateScore();

        calcFeetAndInchesToCentimeters(6.0, 3.0);
        calcFeetAndInchesToCentimeters(4.0 * 12.0);
        calcFeetAndInchesToCentimeters(8.0 * 12.0 + 5.0);
    }
    // Tim's way below >>
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = (feet * 12.0) * 2.54;
        centimeters += (inches * 2.54);
        System.out.println("Centimeters total is: " + centimeters);

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feet = (int) (inches / 12.0);
        System.out.println("Feet = " + feet);
        double remainingInches = inches - (feet * 12.0);
        System.out.println("Remaining inches = " + remainingInches);
        calcFeetAndInchesToCentimeters(feet, remainingInches);

        return 0.0;
    }
    // End of Tim's way

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + ", score was "
            + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown Player's, score was " + score);
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player, no score.");
        return -1;
    }

    // Create a method called calcFeetAndInchesToCentimeters
    // Needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
    //
    // You should validate that the first parameter feet is >=0
    // You should validate that the 2nd parameter inches is >=0 and <=12
    // return -1 from the method if either of the above is not true
    //
    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    //
    // hints: Use double for your number datatypes is probably a good idea
    // 1 inch = 2.54cm and one foot = 12 inches
    // Use the link I give you to confirm your code is calculating correctly.

//    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
//        if (feet < 0) {
//            return -1;
//        } else if ((inches < 0) || (inches > 12)) {
//            return -1;
//        } else {
//            return (feet * 12) + inches;
//        }
//    }
//
//    public static void calcFeetAndInchesToCentimeters(double inches) {
//        double centimeters = (inches * 2.54);
//        System.out.println("Number of centimeters: " + centimeters);
//    }

}
