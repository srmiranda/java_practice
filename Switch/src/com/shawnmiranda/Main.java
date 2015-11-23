package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {

        int switchValue = 6;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
            System.out.println("Value was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");
                break;
        }

        // Create a new switch statement using char instead of int
        // Create a new char variable
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display a message if any of these are found and then break
        // Add a devault which displays a message saying not found

        char letterValue = 'C';
        switch(letterValue) {
            case 'A':case 'B':case 'C':case 'D':case 'E':
                System.out.println("The character was " + letterValue);
                break;
            default:
                System.out.println("Not Found!");
                break;
        }

        String month = "JANuary";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
