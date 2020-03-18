package com.example.AuthoredBook.Entity.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public void createBankAccount(Bank bank){
        bankRepository.save(bank);
    }

    @Transactional
    public void transfer(double amount){
        Bank bankAccount1 = bankRepository.findById(1).get();
        bankAccount1.setBalance(bankAccount1.getBalance() - amount);
        bankRepository.save(bankAccount1);

        if(true){
            throw new RuntimeException();
        }

        Bank bankAccount2 = bankRepository.findById(2).get();
        bankAccount2.setBalance(bankAccount2.getBalance() + amount);
        bankRepository.save(bankAccount2);
    }

}
