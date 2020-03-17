package com.example.Associations.Inheritance.TablePerClass.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//Inheritance mapping-2 Implement and demonstrate Joined strategy.

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BasicEmployee {
    @Id
    private int id;
    private double salary;

    public BasicEmployee() {
    }

    public BasicEmployee(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
