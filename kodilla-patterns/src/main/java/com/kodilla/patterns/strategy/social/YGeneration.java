package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.SnapchatPublisher;

public class YGeneration extends User {

    public YGeneration(String user) {
        super(user);
        this.socialPublisher = new SnapchatPublisher();
    }
}
