package com.example.Associations.Inheritance.SingleTable.Entity;

import org.hibernate.annotations.DiscriminatorOptions;

import javax.persistence.*;

//Inheritance Mapping-1 Implement and demonstrate Single Table strategy.

@Entity
@Inheritance
@DiscriminatorColumn(name = "paymentmode", discriminatorType = DiscriminatorType.STRING)
public class Payment {

    @Id
    private int id;
    private double amount;

    public Payment(int id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Payment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
