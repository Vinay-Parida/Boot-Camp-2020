package com.example.Associations.JPQL.Repository;

import com.example.Associations.JPQL.Entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query("from Employee")
    List<Employee> getAllEmployee();

    @Query("select firstName, lastName, age from Employee where salary > (select avg (salary) from Employee) order by age asc")
    List<Object[]> findEmployeeWithAboveThanAverageSalaryWithAgeAscending();

    @Query("select firstName, lastName, salary from Employee where salary > (select avg (salary) from Employee) order by salary desc")
    List<Object[]> findEmployeeWithAboveThanAverageSalaryWithSalaryDesc();

    @Query("select avg (salary) from Employee")
    double getAverageSalary();

    @Transactional
    @Modifying
    @Query("update Employee set salary = :sal where salary < :avgSal")
    void updateSalarywholeSalaryIsLessThanAverageSalary(@Param("sal") double sal, @Param("avgSal") double avgSal);

    @Query("select min(salary) from Employee")
    double getMinimumSalary();

    @Transactional
    @Modifying
    @Query("delete from Employee where salary = :minSal")
    void deleteEmployeeWithMinimumSalary(@Param("minSal") double minSal);

    @Query(value = "select id, first_name, age from employee where last_name = 'Singh'", nativeQuery = true)
    List<Object[]> findEmployeeWithSingh();

    @Transactional
    @Modifying
    @Query(value = "delete from employee where age > :fortyFive", nativeQuery = true )
    void deleteEmployeeAgeAove45(@Param("fortyFive") int age);

}
