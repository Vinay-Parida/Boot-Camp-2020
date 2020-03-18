package com.example.AuthoredBook.Repository;

import com.example.AuthoredBook.Entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}

