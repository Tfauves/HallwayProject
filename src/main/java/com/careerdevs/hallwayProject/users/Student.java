package com.careerdevs.hallwayProject.users;


import javax.persistence.Entity;

@Entity
public class Student extends User {
//    private Locker locker;


    public Student(){}

    public Student(long id, String firstName, String lastName, String userName) {
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
