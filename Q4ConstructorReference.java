//Q4 Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
// and get the instance of the Class using constructor reference

package com.company;

interface ConstructorInterface{
    Employee ob();
}
class Employee{
    String name;
    int age;
    String city;
    public Employee(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public Employee employeeMethod() {
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class Q4ConstructorReference {
    public static void main(String[] args) {
        ConstructorInterface constructorInterfaceObject = new Employee("Vinsy", 21, "Noida")::employeeMethod;
        System.out.println(constructorInterfaceObject.ob());
    }

}


