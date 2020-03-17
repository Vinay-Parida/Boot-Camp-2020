package com.example.Associations.Inheritance.JoinedTable.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//Inheritance Mapping-3 Implement and demonstrate Table Per Class strategy

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Bank {

    @Id
    private int bank_id;
    private String bank_name;

    Bank(){}

    public Bank(int bank_id, String bank_name) {
        this.bank_id = bank_id;
        this.bank_name = bank_name;
    }

    public int getBank_id() {
        return bank_id;
    }

    public void setBank_id(int bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
}
