package com.manchesterdigital;

import java.util.*;

public class Restaurant {
    public Map<String, List<String>>
    getMenu() {
        return menu;
    }

    Map<String, List<String>> menu = new HashMap<>();


    public List<String> returnDishes(String typeOfDish) {

        List<String> arrayList;

        if(menu.containsKey(typeOfDish)) {
            arrayList = menu.get(typeOfDish);
        } else {
            throw new NullPointerException("Dish do not exist");
        }

        return arrayList;
    }

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.getMenu().put("Mexican", Arrays.asList("Burito", "Taco"));

        System.out.println(restaurant.returnDishes("Mexican"));
        System.out.println(restaurant.returnDishes("FDF"));
    }
}
