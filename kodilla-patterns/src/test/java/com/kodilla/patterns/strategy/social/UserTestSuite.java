package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.media.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User adam = new Millenials("Adam Kowalski");

        //When
        String mediaRecommended = adam.sharePost("test");
        System.out.println("The post will be published in: " + mediaRecommended);

        //Then
        assertEquals("Posted in Facebook following message: test", mediaRecommended);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User piotr = new Millenials("Piotr Nowak");

        //When
        piotr.setSocialPublisher(new TwitterPublisher());
        String mediaRecommended = piotr.sharePost("test");
        System.out.println("The post will be published in: " + mediaRecommended);

        //Then
        assertEquals("Posted in Twitter following message: test", mediaRecommended);
    }
}
