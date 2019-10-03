package com.manchesterdigital;

public enum Countries {
    GERMANY("GERMANY", "de"),
    SPAIN("SPAIN", "es");
    private String name;
    private String isoCode;

    Countries(String name, String isoCode){
        this.name = name;
        this.isoCode = isoCode;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public String getName() {
        return name;
    }
}
