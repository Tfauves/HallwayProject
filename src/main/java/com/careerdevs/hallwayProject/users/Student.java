package com.careerdevs.hallwayProject.users;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student extends User {
    private @Id @GeneratedValue Long id;
//    private Locker locker;

    public Student(){}

    public Student(Long id, String firstName, String lastName, String userName) {
        super(id, firstName, lastName, userName);
    }

    @Override
    void goToLocker() {

    }

    @Override
    void putInLocker() {

    }

    @Override
    void updateLocker() {

    }

    @Override
    void deleteFromLocker() {

    }
}
