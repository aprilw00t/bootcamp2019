package com.manchesterdigital;

public interface IsChargable {
    void supercharde();

    default void describe(){
        System.out.println("Im green");
    }
}
