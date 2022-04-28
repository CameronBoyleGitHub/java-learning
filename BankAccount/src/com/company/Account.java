package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("00000", 0.0, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public Account() {
        // Giving the default constructor some default values
        this("00000", 0.00, "DefaultName", "default@emal.com", "8888888888");
        System.out.println("Empty constructor called.");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit successful, your new current balance is: " + this.balance + ".");
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Cannot withdraw, only " + this.balance + " left in the account.");
        }
        else {
            this.balance -= withdrawalAmount;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
