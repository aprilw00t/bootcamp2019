package com.manchesterdigital;

public class Tesla extends Vehicle implements movement{
    public Tesla(String colour, Integer numberOfSeats, TransmissionType transmissionType, Double engineSize, String manufacturer) {
        super(colour, numberOfSeats, transmissionType, engineSize, manufacturer);
    }
    @Override
    public void moveForwards(){
        System.out.println("moving forwards");
    }

    @Override
    public void reverse() {
        System.out.println("moving backwards");

    }
}
