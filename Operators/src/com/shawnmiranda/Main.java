package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);


        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if (topScore == 100)
            System.out.println("You got the high score!");

        int secondTopScore = 75;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        boolean wasCar = (isCar) ? true : false;
        System.out.println(wasCar);

        // 1. Create a double variable with the value of 20.
        // 2. Create a second double variable with the value of 80.
        // 3. Add both numbers up and mulitply by 25
        // 4. Calculate the remainder of the total and 2,300
        // 5. Write an "if" statement that displays a message
        // 6. "Total was over the limit" if the remaining total is
        //     equal to 200 or less

        double firstVar = 20d;
        double secondVar = 80d;
        double thirdVar = (firstVar + secondVar) * 25d;

        double total = thirdVar % 2300;
        if (total <= 200)
            System.out.println("Total was over the limit");





    }
}
