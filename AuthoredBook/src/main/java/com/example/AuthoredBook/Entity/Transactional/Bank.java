package com.example.AuthoredBook.Entity.Transactional;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

    @Id
    private int id;
    private double balance;

    Bank(){}

    public Bank(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
