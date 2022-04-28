package com.company;

public class Car {
    // Member Variables/Fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // Mutator Function(s)
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("coolcar")) {
            this.model = model;
        }
        else {
            this.model = "Unknown";
        }

    }

    // Accessor Function(s)
    public String getModel() {
        return this.model;
    }

}
