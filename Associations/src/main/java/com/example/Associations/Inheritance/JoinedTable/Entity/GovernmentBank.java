package com.example.Associations.Inheritance.JoinedTable.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "bank_id")
public class GovernmentBank extends Bank {

    private int noOfLunchBreaks;

    GovernmentBank(){}

    public GovernmentBank(int noOfLunchBreaks) {
        this.noOfLunchBreaks = noOfLunchBreaks;
    }

    public GovernmentBank(int bank_id, String bank_name, int noOfLunchBreaks) {
        super(bank_id, bank_name);
        this.noOfLunchBreaks = noOfLunchBreaks;
    }

    public int getNoOfLunchBreaks() {
        return noOfLunchBreaks;
    }

    public void setNoOfLunchBreaks(int noOfLunchBreaks) {
        this.noOfLunchBreaks = noOfLunchBreaks;
    }
}
