package com.manchesterdigital;

public enum OrderStatus { // creates an enum named OrderStatus
    PENDING("order is pending"),DISPATCHED("order dispatched"), DECLINED("order declined"), AWAITING_PAYMENT("awaiting payment"), PROCESSED("order processed");
    private String message; // declares a String variable message but does not allocate a value

    OrderStatus(String message){//creates a constructor named OrderStatus with the parameter "message"
        this.message = message; //Initializes variable message with the argument value
    }

    public String getMessage() { //creates a method called getMessage that returns a string
        return message; //returns message
    }
}
