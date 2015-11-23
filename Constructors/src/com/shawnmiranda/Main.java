package com.shawnmiranda;

public class Main {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the accound number, balance, customer name
        //  email, and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods.
        // 1. To allow the customer to deposit funds (increment balance)
        // 2. To withdraw funds. This should deduct from the balance field
        //  but not allow the withdrawl to complete if their are insufficient
        // funds.
        // You will want to create various code in the Main class to confirm
        // your code is working.
        // Add some System.out.println's in the two methods above as well.

        Account newAccount = new Account("12345SA", 0.00, "Bob Brown", "bobsemail@gmail.com",
                "(555) 555-5555");

        newAccount.deposit(200);
        newAccount.withrawal(100);
        newAccount.withrawal(600);
        System.out.println("Account name: " + newAccount.getName());
        System.out.println("Account number: " + newAccount.getAccountNumber());
        System.out.println("Account balance: " + newAccount.getBalance());
    }
}
