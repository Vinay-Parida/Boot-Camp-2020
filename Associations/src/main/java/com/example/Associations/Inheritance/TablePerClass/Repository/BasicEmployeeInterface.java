package com.example.Associations.Inheritance.TablePerClass.Repository;

import com.example.Associations.Inheritance.TablePerClass.Entity.BasicEmployee;
import org.springframework.data.repository.CrudRepository;

public interface BasicEmployeeInterface extends CrudRepository<BasicEmployee, Integer> {

}
