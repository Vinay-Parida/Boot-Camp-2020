package com.example.AuthoredBook.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private int street_number;
    private String location;
    private String state;

    Address(){}

    public Address(int street_number, String location, String state) {
        this.street_number = street_number;
        this.location = location;
        this.state = state;
    }

    public int getStreet_number() {
        return street_number;
    }

    public void setStreet_number(int street_number) {
        this.street_number = street_number;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
