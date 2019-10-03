package com.manchesterdigital;

public class ToTests {

    protected static double temperatureConverter(String units, double temp ){
        double result;

        if(units.equalsIgnoreCase("f")){
             result = (temp - 32)* 5 / 9;
        }
        else {
            result = (temp * 9 / 5) + 32;

            System.out.println(result);

        }
    return result; }

}
