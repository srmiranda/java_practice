package com.shawnmiranda;

/**
 * Created by Sasquatch on 11/23/15.
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public Account() {
        this("56789", 2.50, "Default Name", "Default Email", "Default Phone"); // All default values
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String name, String email,
                   String phoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Added $" + depositAmount + " to your account. New balance is $" + this.balance);
    }

    public void withrawal(double withdrawalAmount) {
        if(this.balance - withdrawalAmount <= 0) {
            System.out.println("Only $" + this.balance + " available. Withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
