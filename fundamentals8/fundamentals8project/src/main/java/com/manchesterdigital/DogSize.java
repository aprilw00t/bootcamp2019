package com.manchesterdigital;

import com.sun.tools.internal.xjc.generator.bean.DualObjectFactoryGenerator;

public enum DogSize {
    SMALL("yipp"),
    MEDIUM("ruff"),
    LARGE("woof"),
    XLARGE("BOOF");

    private String noise;

    DogSize(String noise){
        this.noise = noise;
    }

    public String getNoise() {
        return noise;
    }
}
