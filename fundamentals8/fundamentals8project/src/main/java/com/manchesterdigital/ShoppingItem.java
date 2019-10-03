package com.manchesterdigital;

public class ShoppingItem {
    final String itemName;
   private Integer itemAmount;

    public ShoppingItem(String itemName, Integer itemAmount) {
        this.itemName = itemName;
        this.itemAmount = itemAmount;
    }

    public Integer getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Integer itemAmount) {
        this.itemAmount = itemAmount;
    }
}
