package com.careerdevs.hallwayProject.users;

public abstract class User {
    private long id;
    private String firstName;
    private String lastName;
    private String userName;


    public User() {}

    public User(long id, String firstName, String lastName, String userName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
    }

    abstract void goToLocker();
    abstract void putInLocker();
    abstract void updateLocker();
    abstract void deleteFromLocker();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
