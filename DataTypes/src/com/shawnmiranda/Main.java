package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        // 8 Primitive Data Types

        // String Type (9th type, not technically a primitive data type, its a Class)

        String myString = "This is a string";
        System.out.println("Mystring is equal to " + myString + ".");

        myString = myString + ", and this is more.";
        System.out.println("Mystring is equal to " + myString);

        myString = myString + " \u00A9 2015";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The results is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        // converts the int into a string

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
        // converts the double into a string

    }
}
