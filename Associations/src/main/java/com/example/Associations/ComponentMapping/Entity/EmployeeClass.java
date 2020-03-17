package com.example.Associations.ComponentMapping.Entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

//Component Mapping-1 Implement and demonstrate Embedded mapping using employee table having following fields:
//                                      id, firstName, lastName, age, basicSalary, bonusSalary, taxAmount, specialAllowanceSalary.

@Entity
public class EmployeeClass {

    @Id
    private int id;
    private String firstname;
    private String lastname;
    private int age;
    @Embedded
    private EmployeeSalary salary;

    EmployeeClass(){}

    public EmployeeClass(int id, String firstname, String lastname, int age, EmployeeSalary salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public EmployeeSalary getSalary() {
        return salary;
    }

    public void setSalary(EmployeeSalary salary) {
        this.salary = salary;
    }
}
