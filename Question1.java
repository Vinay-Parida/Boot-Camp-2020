//Q1 1. Create Java classes having suitable attributes for Library management system.
// Use OOPs concepts in your design.Also try to use interfaces and abstract classes.

package com.company;

class Books{
    int id;
    String authorName;
    String booknName;
}

abstract class User{
    int userId;
    String userName;

    User(int id, String name){
        this.userId = id;
        this.userName = name;
    }
}

class Librarian extends User{
    int librarianId;
    Librarian(int id, String name, int lid) {
        super(id, name);
        this.librarianId = lid;
    }
    void issueBooks(){}
    void addNewBooks(){}
    void addNewEdition(){}
    void addFine(){}
}

class Customer extends User{
    int customerId;
    Customer(int id, String name, int cid) {
        super(id, name);
        this.customerId= cid;
    }
    void getBooks(){}
    void returnBooks(){}
    void payFine(){}
}


public class Question1 {

}
