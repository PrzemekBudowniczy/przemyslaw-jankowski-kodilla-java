package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;

public class ZGeneration extends User {

    public ZGeneration(String user) {
        super(user);
        this.socialPublisher = new TwitterPublisher();
    }
}
