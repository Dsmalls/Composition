package com.Section7;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "HP", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Monster", "ASUS", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("TI-200", "Acer", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
        System.out.println("============================");
        // getting access from the PC class
        // thePC.getMonitor().drawPixelAt(1500, 1200, "purple");
        // getting access from the Motherboard class
        // thePC.getMotherboard().loadProgram("Windows 10");
        // Case class
        // thePC.getTheCase().pressPowerButton();

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Platform", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Homemade", false, 75);

        Bedroom bedroom = new Bedroom("Dez", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();



    }
}
