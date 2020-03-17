package com.example.Associations.Inheritance.JoinedTable.Repository;

import com.example.Associations.Inheritance.JoinedTable.Entity.Bank;
import org.springframework.data.repository.CrudRepository;

public interface BankRepository extends CrudRepository<Bank, Integer> {
}
