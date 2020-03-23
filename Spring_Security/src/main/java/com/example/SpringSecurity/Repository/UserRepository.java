package com.example.SpringSecurity.Repository;

import com.example.SpringSecurity.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
