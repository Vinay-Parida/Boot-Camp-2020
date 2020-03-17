package com.example.Associations.Inheritance.SingleTable.Repository;

import com.example.Associations.Inheritance.SingleTable.Entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
