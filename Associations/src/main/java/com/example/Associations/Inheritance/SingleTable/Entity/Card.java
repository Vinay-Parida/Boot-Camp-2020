package com.example.Associations.Inheritance.SingleTable.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class Card extends Payment{

    private String cardnumber;

    Card() {
        super();
    }

    public Card(int id, double amount, String cardnumber) {
        super(id, amount);
        this.cardnumber = cardnumber;
    }


    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
}
