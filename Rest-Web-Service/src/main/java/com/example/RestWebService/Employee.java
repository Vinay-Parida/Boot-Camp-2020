package com.example.RestWebService;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Range;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Negative;
import javax.validation.constraints.Size;

@JsonFilter("FilteringEverythingExceptpassword")                            //Used for Dynamic Filtering.   //It can't be used with JsonIgnore
@ApiModel(description = "Creating Employee class with id, name and age")     //Part of swagger documentation
public class Employee {
    @ApiModelProperty(notes = "Integer Id of an employee")
    private Integer id;

    @Size(min = 2, message = "Minimum length of the string is 2")
    @ApiModelProperty(notes = "String name of the employee")
    //Size and Range is used for validation
    private String name;

    @Range(min = 0, message = "Age can't be negative")
    @ApiModelProperty(notes = "Int age of an employee")
    private int age;


    //Part-2-Q8 Create API which saves details of User (along with the password) but on successfully saving returns only non-critical data.
//    @JsonIgnore                  //JsonIgnore will not work with JsonFilter           //This field is not show while showing details of the users
    private String password;

    public Employee(Integer id, String name, int age, String password) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
