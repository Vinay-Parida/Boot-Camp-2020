package com.example.Associations.Inheritance.TablePerClass.Entity;

import javax.persistence.Entity;

@Entity
public class PermanentEmployee extends BasicEmployee {

    private int paidLeaves;

   PermanentEmployee(){}

    public PermanentEmployee(int id, double salary, int paidLeaves) {
        super(id, salary);
        this.paidLeaves = paidLeaves;
    }

    public int getPaidLeaves() {
        return paidLeaves;
    }

    public void setPaidLeaves(int paidLeaves) {
        this.paidLeaves = paidLeaves;
    }
}
