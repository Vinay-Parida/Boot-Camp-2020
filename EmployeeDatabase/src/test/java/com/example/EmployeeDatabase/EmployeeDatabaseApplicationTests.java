package com.example.EmployeeDatabase;

import com.example.EmployeeDatabase.Entity.Employee;
import com.example.EmployeeDatabase.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class EmployeeDatabaseApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testCreate(){
		Employee employee = new Employee();
		employee.setId(2);
		employee.setName("Marc Spector");
		employee.setAge(29);
		employee.setAddress("Egypt");

		employeeRepository.save(employee);
	}

	@Test
	void testRead(){
		Employee employee = employeeRepository.findById(1).get();
		System.out.println(employee);
	}

	@Test
	void testUpdate(){
		Employee employee = employeeRepository.findById(1).get();
		employee.setAge(22);
		employeeRepository.save(employee);
	}

	@Test
	void testDelete(){
		employeeRepository.deleteById(2);
	}

	@Test
	void testCount(){
		System.out.println("Total records -------------------> " + employeeRepository.count());
	}

	@Test
	void testFindByName(){
		List<Employee> findByName = employeeRepository.findByName("Vinay");
		findByName.forEach(p -> System.out.println(p.getName()));
	}

	@Test
	void testFindByDescLike(){
		List<Employee> employee = employeeRepository.findByNameLike("V%");
		employee.forEach(p -> System.out.println(p.getName()));
	}

	@Test
	void testFindbyAgeBetween(){
		List<Employee> employee = employeeRepository.findByAgeBetween(28,32);
		employee.forEach(p -> System.out.println("Name: " + p.getName() + " Age: " + p.getAge()));
	}

	@Test
	void testpaging(){
		Pageable pageable = PageRequest.of(0,2, (Sort.by("age")));

		Page<Employee> finaAll = employeeRepository.findAll(pageable);

		finaAll.forEach(p -> System.out.println("Name: " + p.getName() + "; Age: " + p.getAge()));
	}
}
