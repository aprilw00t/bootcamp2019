package com.manchesterdigital;

public abstract class Person {
    private final String firstName;
    private final String lastNmae;
    private final Integer age;
private final Address address;

    public Person(String firstName, String lastNmae, Integer age, Address address) {
        this.firstName = firstName;
        this.lastNmae = lastNmae;
        this.age = age;
        this.address = address;
    }

    public abstract void haveLunch();

    public final String sayHello(){
        return "hello";
    }

    public void printAddress(){
        System.out.println(address.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNmae() {
        return lastNmae;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

}
