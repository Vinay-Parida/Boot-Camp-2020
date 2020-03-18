package com.example.AuthoredBook.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {

    @Id
    private int id;
    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private Set<Subject> subjects;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "authors_id", referencedColumnName = "id"),
                                     inverseJoinColumns = @JoinColumn(name = "books_id", referencedColumnName = "book_id"))
    private Set<Book> book;

    Author(){}

    public Author(int id, String name, Address address, Set<Subject> subjects) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(Set<Subject> subjects) {
        this.subjects = subjects;
    }
}
