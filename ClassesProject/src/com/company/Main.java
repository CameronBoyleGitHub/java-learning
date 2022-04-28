package com.company;

public class Main {

    public static void main(String[] args) {

        // In java we have to initialize objects with
        // a value, onto the heap.
	    Car car = new Car();
        car.setModel("CoolCar");
        System.out.println("This car model is " + car.getModel());

        Car truck = new Car();
        truck.setModel("truck");
        System.out.println("This car model is " + truck.getModel());
    }
}
