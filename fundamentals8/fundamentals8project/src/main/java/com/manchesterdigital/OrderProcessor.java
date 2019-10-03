package com.manchesterdigital;

public class OrderProcessor {
    private OrderStatus orderStatus; //declaring an enum Orderstatus with the name orderstatus

    public OrderProcessor(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }// create a constructor that sets the orderstatus declared at the top to the value of th order status passed as an argument

    public void printOrderMessage(){ //creates a method called printOrderMessage
        System.out.println(orderStatus.getMessage()); // prints the result of orderStatus.getMessage() the getMessage method of the orderStatus instance of the enum
    }
    public void obtainCurrentOrderStatus(){
        if(orderStatus == OrderStatus.DISPATCHED){
            System.out.println("you should recieve your order soon...");
        }
        else{
            System.out.println("DUNNO WHERE IT WENT SOZ M8" +
                    "");
        }
    }
}
