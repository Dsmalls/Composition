package com.Section7;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "HP", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Monster", "ASUS", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("TI-200", "Acer", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        // getting access from the PC class
        thePC.getMonitor().drawPixelAt(1500, 1200, "purple");
        // getting access from the Motherboard class
        thePC.getMotherboard().loadProgram("Windows 10");
        // Case class
        thePC.getTheCase().pressPowerButton();
    }
}
