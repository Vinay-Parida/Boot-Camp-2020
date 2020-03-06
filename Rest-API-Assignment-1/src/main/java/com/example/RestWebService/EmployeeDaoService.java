package com.example.RestWebService;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component  // Talk to the database
public class EmployeeDaoService {
    private static List<Employee> employeesList = new ArrayList<>(); //As it will be accessed by lots of classes we made it static

    public static int employeeCount = 4;

    static {
        employeesList.add(new Employee(1, "Vinay", 21));
        employeesList.add(new Employee(2, "Ankit", 23));
        employeesList.add(new Employee(3, "Aman", 24));
        employeesList.add(new Employee(4, "Aradhya", 22));

    }

    //Q2 Create an Employee Bean(id, name, age) and service to  perform different operations related to employee.

    public List<Employee> getEmployeeList() {  //To return every employee list
        return employeesList;
    }

    public Employee saveEmployee(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(++employeeCount);
        }
        employeesList.add(employee);
        return employee;
    }

    public Employee getOneEmployee(int id) {
        for (Employee emp : employeesList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee deleteById(int id) {
        Iterator<Employee> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                iterator.remove();
                return employee;
            }

        }
        return null;
    }

    public Employee putEmplyoee(Integer id, Employee emp) {
        Iterator<Employee> iterator = employeesList.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getId() == id) {
                employee.setName(emp.getName());
                employee.setAge(emp.getAge());
            }
        }
        return emp;
    }

}
