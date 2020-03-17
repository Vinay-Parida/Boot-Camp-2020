package com.example.Associations.ComponentMapping.Repository;

import com.example.Associations.ComponentMapping.Entity.EmployeeClass;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeClassRepository extends CrudRepository<EmployeeClass, Integer> {
}
