package com.manchesterdigital;

public class Address {
    private final String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String AddressLine4;
    private final String town;
    private final String postcode;

    public Address(String addressLine1, String town, String postcode) {
        this.addressLine1 = addressLine1;
        this.town = town;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", addressLine3='" + addressLine3 + '\'' +
                ", AddressLine4='" + AddressLine4 + '\'' +
                ", town='" + town + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
