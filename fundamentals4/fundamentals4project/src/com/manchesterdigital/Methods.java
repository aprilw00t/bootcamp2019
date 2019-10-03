package com.manchesterdigital;

public class Methods {
    // <access  modifier> <optional final> <return type> <method name> (paranthesis) <optional exception>
    // public - open to the world,
    // private - open only to the class,
    // protected - protected only to the package
    // make things immutable, final helps with this
    // methods use camelCase
    // throws - throwing an exception, when tehre is an exception to the rule
    // void returns nothing
    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary =20000;
        int numberOfSales = 1000;
        double commissionRate = 3;
        int bonus = 1000;
        if(taxYearEnded){
            double totalSalary = baseSalary + (numberOfSales * commissionRate);

            if (numberOfSales > 500){
                totalSalary += bonus;
            }
            System.out.println("Total salary: " + totalSalary);
        }
        numberOfSales = 300;
        baseSalary = 250_000;
        commissionRate = 2;
         if(taxYearEnded){
             double totalSalary = baseSalary + (numberOfSales * commissionRate);
             System.out.println("Total salary:" + totalSalary);
         }
    }
}
