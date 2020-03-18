package com.example.AuthoredBook.Entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Book {

    @Id
    private int book_id;
    private String bookname;

    @ManyToMany(mappedBy = "book")
    private Set<Author> author;

    Book(){}

    public Book(String bookname, Set<Author> author) {
        this.bookname = bookname;
        this.author = author;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }


    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }
}
