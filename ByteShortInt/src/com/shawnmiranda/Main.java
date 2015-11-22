package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber = 100;

        short myShortNumber = 30000;

        int myIntNumber = 12_000_000;

        long myLongNumber = 50_000L + 10L * (myByteNumber + myShortNumber + myIntNumber);

        System.out.println("My Total = " + myLongNumber);

    }
}
