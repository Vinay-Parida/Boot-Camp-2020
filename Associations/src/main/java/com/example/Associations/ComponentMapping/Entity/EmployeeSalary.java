package com.example.Associations.ComponentMapping.Entity;

import com.example.Associations.JPQL.Entity.Employee;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeSalary {

    private double basicsalary;
    private double bonussalary;
    private double taxamount;
    private double specialallowanceaalary;

    EmployeeSalary(){}


    public EmployeeSalary(double basicsalary, double bonussalary, double taxamount, double specialallowanceaalary) {
        this.basicsalary = basicsalary;
        this.bonussalary = bonussalary;
        this.taxamount = taxamount;
        this.specialallowanceaalary = specialallowanceaalary;
    }

    public double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public double getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(double bonussalary) {
        this.bonussalary = bonussalary;
    }

    public double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(double taxamount) {
        this.taxamount = taxamount;
    }

    public double getSpecialallowanceaalary() {
        return specialallowanceaalary;
    }

    public void setSpecialallowanceaalary(double specialallowanceaalary) {
        this.specialallowanceaalary = specialallowanceaalary;
    }
}
