package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int pciSlots;
    private String bios;

    public void loadProgram(String programName) {
        System.out.println("Program: " + programName + " is now loading...");
    }
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getPciSlots() {
        return pciSlots;
    }

    public String getBios() {
        return bios;
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int pciSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.pciSlots = pciSlots;
        this.bios = bios;
    }
}
