package com.example.AuthoredBook.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subject {

    @Id
    private int subject_id;
    private String subject_name;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    Subject(){}

    public Subject(int subject_id, String subject_name) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
