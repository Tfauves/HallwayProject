package com.careerdevs.hallwayProject.users;

public abstract class User {
    private long Id;
    private String firstName;
    private String lastName;
    private String userName;

    abstract void goToLocker();
    abstract void putInLocker();
    abstract void updateLocker();
    abstract void deleteFromLocker();

}
