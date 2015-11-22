package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char mySecondChar = '2';
        char myThirdChar = 'a';
        char myFourthChar = '\u00A9';
        // Can only be 1 character

        System.out.println("Unicode Output: " + myFourthChar);

        boolean myBoolean = true;
        boolean myOtherBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbl on the same line as the copyright symbol
        // 2. Create a variable of the type char and assign it the unicode value for that symbol.
        // 3. Display it on screen.

        char registered = '\u00AE';
        System.out.println("Unicode Registered Symbol: " + registered);

    }
}
