package com.company;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "mymail@mail.com", "6666666666");
        bobsAccount.withdrawal(100);
        bobsAccount.deposit(200);
        bobsAccount.withdrawal(100);
    }
}
