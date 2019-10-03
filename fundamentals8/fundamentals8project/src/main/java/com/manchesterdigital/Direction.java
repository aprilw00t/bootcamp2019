package com.manchesterdigital;

public enum Direction {
    FORWARDS("moved forwards by"),BACKWARDS("moved backwards by"), LEFT("moved left by"), RIGHT("moved right nby");
    private String message;

    Direction(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
