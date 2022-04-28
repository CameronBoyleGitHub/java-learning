package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String numbersAsString = "2018";
        System.out.println("NUmbera as string =" + numbersAsString);

        // Using static wrapper class
        int number = Integer.parseInt(numbersAsString);
        System.out.println("Number = " + number);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year of Birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handles the new line key press from the enter key

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();


        System.out.println("Your name is: " + name);
        System.out.println("Your age is " + (2022 - yearOfBirth) );

        // Remember to close our scanner when we're done with it!
        scanner.close();
    }
}
