package com.example.Associations.JPQL;

import com.example.Associations.ComponentMapping.Entity.EmployeeClass;
import com.example.Associations.ComponentMapping.Entity.EmployeeSalary;
import com.example.Associations.ComponentMapping.Repository.EmployeeClassRepository;
import com.example.Associations.Inheritance.JoinedTable.Entity.GovernmentBank;
import com.example.Associations.Inheritance.JoinedTable.Entity.PrivateBank;
import com.example.Associations.Inheritance.JoinedTable.Repository.BankRepository;
import com.example.Associations.Inheritance.SingleTable.Entity.Card;
import com.example.Associations.Inheritance.SingleTable.Entity.Cheque;
import com.example.Associations.Inheritance.SingleTable.Entity.Payment;
import com.example.Associations.Inheritance.SingleTable.Repository.PaymentRepository;
import com.example.Associations.Inheritance.TablePerClass.Entity.PermanentEmployee;
import com.example.Associations.Inheritance.TablePerClass.Entity.Trainee;
import com.example.Associations.Inheritance.TablePerClass.Repository.BasicEmployeeInterface;
import com.example.Associations.JPQL.Entity.Employee;
import com.example.Associations.JPQL.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class AssociationsApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    BasicEmployeeInterface basicEmployeeInterface;

    @Autowired
    BankRepository bankRepository;

    @Autowired
    EmployeeClassRepository employeeClassRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testCreateEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Vinay");
        employee.setLastName("Parida");
        employee.setAge(21);
        employee.setSalary(10000);

        Employee employee2 = new Employee();
        employee2.setFirstName("Aradhya");
        employee2.setLastName("Patel");
        employee2.setAge(50);
        employee2.setSalary(20000);

        Employee employee3 = new Employee();
        employee3.setFirstName("Aman");
        employee3.setLastName("Singh");
        employee3.setAge(30);
        employee3.setSalary(23000);

        Employee employee4 = new Employee();
        employee4.setFirstName("Priyanka");
        employee4.setLastName("Singh");
        employee4.setAge(33);
        employee4.setSalary(13000);

        Employee employee5 = new Employee();
        employee5.setFirstName("Ankit");
        employee5.setLastName("Rawat");
        employee5.setAge(68);
        employee5.setSalary(31000);

        Employee employee6 = new Employee();
        employee6.setFirstName("Parul");
        employee6.setLastName("Sharma");
        employee6.setAge(32);
        employee6.setSalary(19000);

        employeeRepository.save(employee);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
        employeeRepository.save(employee4);
        employeeRepository.save(employee5);
        employeeRepository.save(employee6);

    }

    @Test
    void getAllEmployee() {
        System.out.println(employeeRepository.getAllEmployee());
    }

    //JPQL-1 Display the first name, last name of all employees having salary greater than average salary
    // ordered in ascending by their age
    @Test
    void testGetEmployeeSalaryAboveAverageWithAgeAscending() {
        List<Object[]> ageAcs = employeeRepository.findEmployeeWithAboveThanAverageSalaryWithAgeAscending();
        for (Object[] i : ageAcs) {
            System.out.println(i[0] + " " + i[1] + " " + i[2]);
        }
    }

    //And ordered in descending by their salary.
    @Test
    void testGetEmployeeSalaryAboveAverageWithSalaryDescending() {
        List<Object[]> ageAcs = employeeRepository.findEmployeeWithAboveThanAverageSalaryWithSalaryDesc();
        for (Object[] i : ageAcs) {
            System.out.println(i[0] + " " + i[1] + " " + i[2]);
        }
    }


    //JPQL-2 Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
    @Test
    void testUpdateSalary() {
        System.out.println(employeeRepository.getAllEmployee());
        System.out.println("Updated Salary:");
        employeeRepository.updateSalarywholeSalaryIsLessThanAverageSalary(40000L, employeeRepository.getAverageSalary());
        System.out.println(employeeRepository.getAllEmployee());

    }

    //JPQL-3 Delete all employees with minimum salary.
    @Test
    void deleteEmolyee() {
        employeeRepository.deleteEmployeeWithMinimumSalary(employeeRepository.getMinimumSalary());
    }


    //Native SQL Query-1 Display the id, first name, age of all employees where last name ends with "singh"
    @Test
    void getemployeeWithLastNameSingh(){
        List<Object[]> emp = employeeRepository.findEmployeeWithSingh();
        for (Object[] i : emp) {
            System.out.println(i[0] + " " + i[1] + " " + i[2]);
        }
    }


    //Native SQL Query-2 Delete all employees with age greater than 45(Should be passed as a parameter)
    @Test
    void deleteEmployeeAgeAbove45(){
        employeeRepository.deleteEmployeeAgeAove45(45);
    }

    @Test
    void createPayment(){

        Payment cheque2 = new Cheque(5, 62712, "gd7281");
        Payment card1 = new Card(6, 78000, "897000");
        Payment card2 = new Card(7, 34299, "62gt32");
        Payment cheque1 = new Cheque(8, 83922, "455222");


        paymentRepository.save(card1);
        paymentRepository.save(card2);
        paymentRepository.save(cheque1);
        paymentRepository.save(cheque2);
    }

    @Test
    void createPermanentEmployee(){
        basicEmployeeInterface.save(new Trainee(1, 20000, "JVM"));
        basicEmployeeInterface.save(new PermanentEmployee(2, 40000, 4));
    }

    @Test
    void createBank(){
        bankRepository.save(new GovernmentBank(1,"Indian Bank", 4));
        bankRepository.save(new GovernmentBank(2, "SBI", 5));
        bankRepository.save(new PrivateBank(3, "ICICI", 7.5));
        bankRepository.save(new PrivateBank(4, "Kotak", 5.65));
    }

    @Test
    void createEmployee(){
        employeeClassRepository.save(new EmployeeClass(1,"Vinay", "Parida", 21,
                                new EmployeeSalary(15100, 500, 300, 500)));
        employeeClassRepository.save(new EmployeeClass(2, "Ra", "Khonshu", 33,
                                new EmployeeSalary(33000,345,543,422)));
    }

}
