package com.manchesterdigital;

import java.util.ArrayList;

public class Scratch {
    public static final String RED_COLOUR = "RED";
    public static void main(String[] args) {
        System.out.println("Colour" + RED_COLOUR);
        System.out.println(RainbowColours.PINK.toString());

        Dog poodle = new Dog(DogSize.SMALL);
Dog labrador = new Dog(DogSize.LARGE);

Address address = new Address("113 meow lane", "Manchester", "BL7 3TH");
Navigator navigator = new Navigator();
navigator.printNavigation(8);

Lights lights = new Lights();
Fan pelonisFan = new Fan();

        ArrayList<Controls> controls = new ArrayList<>();
    controls.add(lights);
    controls.add(pelonisFan);
    }
}
