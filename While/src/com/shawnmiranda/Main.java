package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        for(int i=1; i!=6; i++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

        // Create a method called isEvenNumber that takes a parameter
        //  of type int.
        // Its purpose is to determine if the argument passed to the
        //  element is an even number or not.
        // return true if an even number, otherwise return false

        int number = 5;
        int count = 0;
        int finishNumber = 20;
        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);
            number++;
            count++;
            if (count == 5) {
                System.out.println(count + " even numbers found");
                break;
            }
        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
