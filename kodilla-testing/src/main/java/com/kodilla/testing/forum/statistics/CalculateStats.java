package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateStats {

    int numberOfUsers;
    int numberOfPosts;
    int numberOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;
    Statistics statistics;

    public CalculateStats(Statistics statistics) {
        this.statistics = statistics;
    }

    private void calcNumberOfUsers() {
        List<String> userNames = new ArrayList<>();
        userNames = statistics.usersNames();
        numberOfUsers = userNames.size();
    }

    private void calcNumberOfPosts() {
        numberOfPosts = statistics.postsCount();
    }

    private void calcNumberOfComments() {
        numberOfComments = statistics.commentsCount();
    }

    private void calcAveragePostsPerUser() {
        if (numberOfUsers != 0) {
            averagePostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
        } else {
            averagePostsPerUser = 0;
        }
    }

    private void calcAverageCommentsPerUser() {
        if (numberOfUsers != 0) {
            averageCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        } else {
            averageCommentsPerUser = 0;
        }
    }

    private void calcAverageCommentsPerPost() {
        if (numberOfPosts != 0) {
            averageCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public void calculateAdvStatistics(Statistics statistics) {
        calcNumberOfUsers();
        calcNumberOfPosts();
        calcNumberOfComments();
        calcAveragePostsPerUser();
        calcAverageCommentsPerUser();
        calcAverageCommentsPerPost();
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
