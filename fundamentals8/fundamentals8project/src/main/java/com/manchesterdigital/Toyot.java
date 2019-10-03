package com.manchesterdigital;

public class Toyot extends Vehicle implements movement {
    public Toyot(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double engineSize, String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }
    @Override
    public void moveForwards(){
        System.out.println("moving");}

    @Override
    public void reverse() {
        System.out.println("moving back");
    }

    ;
    }
