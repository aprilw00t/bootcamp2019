package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingDishes {
@Rule
    public ExpectedException expectedException = ExpectedException.none();


    @Test
    public void ReturnsMexicanDIshesWhenMexicanIsEntered(){
        //arrange
        Restaurant restaurant = new Restaurant();
        ArrayList<String> mexicanDishes = new ArrayList<>();
        mexicanDishes.add("Tacos");
        mexicanDishes.add("Burritos");
        String typeOfDish = "Mexican";
        restaurant.getMenu().put(typeOfDish, mexicanDishes);
        //act
        List<String> dishes = restaurant.returnDishes(typeOfDish);
        //assert
        Assertions.assertThat(dishes).isEqualTo(Arrays.asList("Tacos", "Burritos"));
    }

    @Test
    public void ShouldTHrowExceptionWhenTypeOfDishDoesntExoist(){
        //arrange
        expectedException.expect(NullPointerException.class);
        Restaurant restaurant = new Restaurant();
        ArrayList<String> mexicanDishes = new ArrayList<>();
        String typeOfDish = "Mexican";
        //act
        List<String> dishes = restaurant.returnDishes(typeOfDish);

    }

}
