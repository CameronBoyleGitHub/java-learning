package com.company;

public class Main {

    public static void main(String[] args) {
        // Instantiating the "Dimensions" object required for the "Case" object on a separate line/statement
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        // Instantiating the requisite "Resolution" object for the "Monitor" object in an inline fashion
        Monitor theMonitor = new Monitor("The Best", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // Creating a PC,
        // using the getter/accessor to retrieve the Monitor that composes the PC,
        // and utilizing the Monitor's member function
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        // !OBSOLETE!
        //thePC.getMonitor().drawPixelAt(1500,1200, "red");
        //thePC.getMotherboard().loadProgram("Windows 10");
        //thePC.getCase().pressPowerButton();

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern" ,4, 3, 2, 1);

        Lamp lamp = new Lamp("Retro", false, 24);

        Bedroom bedroom = new Bedroom("Tim's bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
