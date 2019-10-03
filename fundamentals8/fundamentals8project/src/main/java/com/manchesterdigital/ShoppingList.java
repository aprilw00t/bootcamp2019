package com.manchesterdigital;

import java.util.ArrayList;

public class ShoppingList {

    ArrayList<ShoppingItem> shopping = new ArrayList<>();
    public ArrayList<ShoppingItem> addsItem(ShoppingItem item) {
     shopping.add(item);
     return shopping;
    }

    public ArrayList<ShoppingItem> removesItem(ShoppingItem item) {
        shopping.remove(item);
        return shopping;
   }

    public ArrayList<ShoppingItem> getItems() {
        return shopping;
    }

    public ShoppingItem getItem(Integer itemNumber){
        return shopping.get(itemNumber);
    }

    public void updatesItemAmount(Integer itemNumber, Integer itemAmount) {
        shopping.get(itemNumber).setItemAmount(itemAmount);
    }
}
