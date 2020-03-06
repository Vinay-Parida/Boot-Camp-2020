package com.example.RestWebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.Resource;
//import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;


//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;     //static import methodOn() method

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResourse {
    @Autowired
    private EmployeeDaoService service;

    //Q3 Implement GET http request for Employee to get list of employees.
    @GetMapping("/users")
    public List<Employee> getAllEmployees() {
        return service.getEmployeeList();
    }

    //Q4 Implement GET http request using path variable top get one employee
    @GetMapping("/users/{id}")
    public EntityModel<Employee> getEmployeeById(@PathVariable int id) {
        Employee employee = service.getOneEmployee(id);
        if (employee == null)
            throw new UserNotFoundException("Id not found: " + id);

//        Resource<Employee> resource = new Resource<>(employee);     // If we don't specify version when importing hateos Spring takes the newest version and it doesn't support Resourse
//        ControllerLinkBuilder link = linkTo(methodOn(this.getClass()).getAllEmployees());

        EntityModel<Employee> entityModel = new EntityModel<Employee>(employee);   //New version have EntityModel istead
        WebMvcLinkBuilder link = linkTo(methodOn(this.getClass()).getAllEmployees());

        entityModel.add(link.withRel("All Users"));
        return entityModel;

    }

    //Q5 Implement POST http request for Employee to create a new employee.
    //Q9 Apply validation while create a new employee using POST http Request. (@Valid API)
    @PostMapping("/users")
    public ResponseEntity<Object> createNewEmployee(@Valid @RequestBody Employee emp) {
        Employee newEmployee = service.saveEmployee(emp);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()                          //get the current URI ie, /users
                .path("/{id}")                                 // add {id} to it to make /users/{id}
                .buildAndExpand(newEmployee.getId()).toUri();  //replacing the uri with the newEmployee id

        return ResponseEntity.created(location).build();       //To get the return status after creating new employee
    }

    //Q6 Implement DELETE http request for Employee to delete employee
    @DeleteMapping("/users/{id}")
    public Employee deleteUser(@PathVariable int id) {
        Employee employee = service.deleteById(id);
        if (employee == null)
            throw new UserNotFoundException("Id is not present");

        return employee;
    }

    //Q8 Implement PUT http request for Employee to update employee
    @PutMapping("users/{id}")
    public Employee editUserDetails(@PathVariable int id, @Valid @RequestBody Employee employee) {
        Employee employee1 = service.putEmplyoee(id, employee);

        return employee1;
    }
}
