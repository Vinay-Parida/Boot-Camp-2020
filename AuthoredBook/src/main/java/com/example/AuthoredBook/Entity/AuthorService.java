package com.example.AuthoredBook.Entity;

import com.example.AuthoredBook.Repository.AuthorRepository;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    EntityManager entityManager;



    public void createAuthor(Set<Author> authorList){
        for (Author i: authorList) {
            for (Subject j: i.getSubjects()) {
                j.setAuthor(i);
            }
            authorRepository.saveAll(authorList);
        }
    }

    @Transactional
    public void findAuthor(){
        Session session = entityManager.unwrap(Session.class);
        Author author = authorRepository.findById(1).get();

        authorRepository.findById(1);
        session.evict(author);
        authorRepository.findById(1);
    }


}
