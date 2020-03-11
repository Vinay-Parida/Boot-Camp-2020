package com.example.Versioning;

public class Address {
    private String houseNumber;
    private String area;
    private String city;
    private int zipcode;

    public Address(String houseNumber, String area, String city, int zipcode) {
        this.houseNumber = houseNumber;
        this.area = area;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
