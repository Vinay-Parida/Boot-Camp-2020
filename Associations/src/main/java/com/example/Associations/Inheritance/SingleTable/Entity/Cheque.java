package com.example.Associations.Inheritance.SingleTable.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cq")
public class Cheque extends Payment{

    private String chequenumber;

    Cheque(){
        super();
    }

    public Cheque(int id, double amount, String chequenumber) {
        super(id, amount);
        this.chequenumber = chequenumber;
    }


    public String getChequenumber() {
        return chequenumber;
    }

    public void setChequenumber(String chequenumber) {
        this.chequenumber = chequenumber;
    }
}
