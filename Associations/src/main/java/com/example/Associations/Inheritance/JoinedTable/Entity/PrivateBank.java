package com.example.Associations.Inheritance.JoinedTable.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "bank_id")
public class PrivateBank extends Bank {

    private double rateOfInterest;

    PrivateBank(){}

    public PrivateBank(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public PrivateBank(int bank_id, String bank_name, double rateOfInterest) {
        super(bank_id, bank_name);
        this.rateOfInterest = rateOfInterest;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
}
