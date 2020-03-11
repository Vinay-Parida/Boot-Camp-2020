package com.example.Versioning;

public class UserV2 {
    private int id;
    private Name name;
    private Address address;

    public UserV2(int id, Name name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserV2{" +
                "id=" + id +
                ", name=" + name +
                ", address=" + address +
                '}';
    }
}

