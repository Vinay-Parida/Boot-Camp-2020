package com.example.Associations.Inheritance.TablePerClass.Entity;

import javax.persistence.Entity;

@Entity
public class Trainee extends BasicEmployee {

    private String bootcamp_session;

    Trainee(){ }

    public Trainee(int id, double salary, String bootcamp_session) {
        super(id, salary);
        this.bootcamp_session = bootcamp_session;
    }

    public String getBootcamp_session() {
        return bootcamp_session;
    }

    public void setBootcamp_session(String bootcamp_session) {
        this.bootcamp_session = bootcamp_session;
    }
}
