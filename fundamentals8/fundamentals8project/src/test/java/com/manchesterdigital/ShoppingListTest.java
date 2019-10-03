package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;

public class ShoppingListTest {

    @Test
    public void AddsAnItemToList(){
        ShoppingList shoppingList = new ShoppingList();
        ArrayList<ShoppingItem>result = shoppingList.addsItem(new ShoppingItem("potato", 6));
        Assertions.assertThat(result.get(result.size()-1)).isEqualTo(new ShoppingItem("potato", 6));

    }
  //  @Test
//    public void RemovesItemFromList(){
//        ShoppingList shoppingList = new ShoppingList();
//        ArrayList<ShoppingItem>result = shoppingList.addsItem(new ShoppingItem("potato", 6));
//shoppingList.addsItem(new ShoppingItem("peas", 6));
//                shoppingList.removesItem("potato");
//        Assertions.assertThat(result.size()).isEqualTo(1);
//        Assertions.assertThat(result).containsExactly("peas");
//
//    }
@Test
    public void ReturnsShoppingList(){

    ShoppingList shoppingList = new ShoppingList();
    shoppingList.addsItem(new ShoppingItem("bean", 6));
    shoppingList.addsItem(new ShoppingItem("pen", 6));
    shoppingList.addsItem(new ShoppingItem("shoes", 6));
            ArrayList<ShoppingItem>result = shoppingList.getItems();
    Assertions.assertThat(result).contains(new ShoppingItem("potato", 6), new ShoppingItem("pen", 6), new ShoppingItem("shoes", 6));
    }
    @Test
    public void ReturnsShoppingItem(){

        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addsItem(new ShoppingItem("potato", 6));
        shoppingList.addsItem(new ShoppingItem("pen", 6));

        ShoppingItem result = shoppingList.getItem(1);
        Assertions.assertThat(result).isEqualTo(new ShoppingItem("pen", 6));

    }

    @Test
    public void ChangesItemOnList(){
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.addsItem(new ShoppingItem("potato", 6));
        shoppingList.updatesItemAmount(0, 4);

        Assertions.assertThat(shoppingList.getItem(0).getItemAmount()).isEqualTo(4);
    }
    }
