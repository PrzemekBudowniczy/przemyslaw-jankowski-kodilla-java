package com.kodilla.patterns.strategy.social;

public class User {

    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(String user) {
        this.userName = user;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost(String messageToPost) {
        return socialPublisher.share(messageToPost);
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
