package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min Value is " + myMinIntValue);
        System.out.println("Integer Max Value is " + myMaxIntValue);
        System.out.println("Overflowed MAX value is " + (myMaxIntValue + 1));
        System.out.println("Underflowed MIN value is " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN value is " + myMinByteValue);
        System.out.println("Byte MAX value is " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MAX value is " + myMaxShortValue);
        System.out.println("Short MIN value is " + myMinShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long MAX value is " + myMaxLongValue);
        System.out.println("Long MIN value is " + myMinLongValue);

        // The necessity of casting
        byte myNewByteValue = (byte) (myMinByteValue / 2);

        // Good practice when dealing with precision point numbers
        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;
    }
}
