package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int userID, final String userName, final char gender, final LocalDate dateOfBirth, final int numberOfPosts) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "\nForumUser{" +
                "userID=" + userID +
                ", userName='" + userName +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
