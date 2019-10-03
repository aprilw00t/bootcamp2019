package com.manchesterdigital;

public class improvedCarDealership {
    boolean taxYearEnded = true;
    int baseSalary = 20000;
    int numberOfSales = 1000;
    double commissionRate = 3;
    int bonus = 1000;

    private static void calculateSalary(boolean taxYearEnded, int numberOfSales, int baseSalary, double commissionRate) {
    if(taxYearEnded){
        int bonus = 1000;
        int totalSalary = baseSalary;

        if(numberOfSales > 500){
            totalSalary = (int) (baseSalary + (numberOfSales * commissionRate));

        }
    }
    }
}