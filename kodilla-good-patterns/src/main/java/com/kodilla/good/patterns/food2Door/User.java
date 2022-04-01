package com.kodilla.good.patterns.food2Door;

public class User {

    private String firstName;
    private String surname;
    private long nationalID;

    public User(String firstName, String surname, long nationalID) {
        this.firstName = firstName;
        this.surname = surname;
        this.nationalID = nationalID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public long getNationalID() {
        return nationalID;
    }
}
