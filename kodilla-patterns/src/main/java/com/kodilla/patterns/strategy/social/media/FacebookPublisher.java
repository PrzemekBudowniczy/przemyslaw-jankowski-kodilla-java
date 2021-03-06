package com.kodilla.patterns.strategy.social.media;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share(String messageToPost) {
        return "Posted in Facebook following message: " + messageToPost;
    }
}
