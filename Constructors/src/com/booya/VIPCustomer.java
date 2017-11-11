package com.booya;

public class VIPCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VIPCustomer() {
        this("John Doe", 1000, "name@email.com");
    }


    public VIPCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println(getName());
        System.out.println(getCreditLimit());
        System.out.println(getEmail());
    }

    public VIPCustomer(String name, String email){
        this(name, 500, email);

    }

    public String getName() {

        return name;
    }

    public int getCreditLimit() {

        return creditLimit;
    }

    public String getEmail() {

        return email;
    }
}
