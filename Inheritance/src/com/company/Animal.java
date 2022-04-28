package com.company;

public class Animal {
    private String name;
    private int brain;
    private int weight;
    private int size;
    private int body;

    public Animal(String name, int brain, int weight, int size, int body) {
        this.name = name;
        this.brain = brain;
        this.weight = weight;
        this.size = size;
        this.body = body;
    }

    public void move() {

    }
    public void eat() {

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }
}
