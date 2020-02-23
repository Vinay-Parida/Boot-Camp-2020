//Q5 Write a program to sort Employee objects based on highest salary using Comparator. Employee class{ Double Age; Double Salary; String Name

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private String name;
    private double age;
    private double salary;

    public Employee(String name, double age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString(){
        return "Employee: " + name + "; Age: " + age + "; Salary: " + salary;
    }
    public double getSalary(){
        return salary;
    }
}

public class Q5SortingEmployee {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Vinay", 21, 200000));
        employees.add(new Employee("Aradhya", 25, 350000));
        employees.add(new Employee("Aman", 30, 100000));
        employees.add(new Employee("Ankit", 32, 900000));
        employees.add(new Employee("Priyanka", 24, 760000));
        employees.add(new Employee("Taman", 20, 400000));
        employees.add(new Employee("Parul", 22, 230000));

        System.out.println(employees);

        Collections.sort(employees, new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        System.out.println("Sorted with salary: " + employees);
    }
}
