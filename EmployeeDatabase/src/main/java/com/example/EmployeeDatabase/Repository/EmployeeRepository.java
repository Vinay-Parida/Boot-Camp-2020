package com.example.EmployeeDatabase.Repository;

import com.example.EmployeeDatabase.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

    List<Employee> findByName(String name);      //Find by name method

    List<Employee> findByNameLike(String name);      //All these method names are pre defined: Like only finfByNameLike only work if there is 'name' column in database

    List<Employee> findByAgeBetween(int age1, int age2);

}
