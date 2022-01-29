package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "Maciej", 'M', LocalDate.of(1980,1,5), 10));
        forumUsers.add(new ForumUser(2, "Kasia", 'F', LocalDate.of(1985,9,28), 210));
        forumUsers.add(new ForumUser(3, "Przemek", 'M', LocalDate.of(1990,3,23), 96));
        forumUsers.add(new ForumUser(4, "Surya", 'M', LocalDate.of(2000,6,19), 57));
        forumUsers.add(new ForumUser(5, "Ishwarya", 'F', LocalDate.of(2010,6,5), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
