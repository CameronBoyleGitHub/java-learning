package com.company;

// Note the use of the "extends" keyword
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // We will be initializing the dog to have 1 brain, and 1 body (hardcoded) and inherit the rest from the parent
    // We will then initialize the new fields
    public Dog(String name, int weight, int size, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, weight, size, 1);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        super.eat();
    }
}
