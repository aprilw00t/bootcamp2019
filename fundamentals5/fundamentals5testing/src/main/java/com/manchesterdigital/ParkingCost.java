package com.manchesterdigital;

public class ParkingCost {
    public static int calculateParkingCost(double time, String carOrVan){
        int cost = 0;
        if (time >= 0 && time < 5){
        cost = 300;}
        else if (time >= 5 && time < 10){
            cost = 350;
        }
        else if (time >= 10 && time <15)
        {
            cost = 500;
        }
        else if (time >=15 && time <20)
        {
            cost = 700;
        }
        else if (time >= 20 && time < 25 )
        {cost = 400;
        }
        if (carOrVan.equalsIgnoreCase("van")) {
            cost = cost*2;
        }
        return cost;
    }
}
