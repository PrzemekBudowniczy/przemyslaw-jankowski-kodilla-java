package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {


    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    void prepareCommonTestData() {
        List<String> userNames = Arrays.asList("1st user", "2nd user", "3th user", "4th user", "5th user");
        when(statisticsMock.usersNames()).thenReturn(userNames);
    }

    @Test
    void testAveragesWhen0Posts() {
        //Given
        CalculateStats calculateStats = new CalculateStats(statisticsMock);
        int numberOfPosts = 0;
        int numberOfComments = 5;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStats.getAveragePostsPerUser());
        assertEquals(1, calculateStats.getAverageCommentsPerUser());
        assertEquals(0, calculateStats.getAverageCommentsPerPost());
    }

    @Test
    void testAveragesWhen1000Posts() {
        //Given
        CalculateStats calculateStats = new CalculateStats(statisticsMock);
        int numberOfPosts = 1000;
        int numberOfComments = 2000;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);
        System.out.println("users: " + calculateStats.getNumberOfUsers() + ", posts: " + calculateStats.getNumberOfPosts() + ", comments: " + calculateStats.getNumberOfComments());
        System.out.println("averagePostsPerUser: " + calculateStats.getAveragePostsPerUser() + ", averageCommentsPerUser: " + calculateStats.getAverageCommentsPerUser() + ", averageCommentsPerPost: " + calculateStats.getAverageCommentsPerPost());

        //Then
        assertEquals(200, calculateStats.getAveragePostsPerUser());
        assertEquals(400, calculateStats.getAverageCommentsPerUser());
        assertEquals(2, calculateStats.getAverageCommentsPerPost());
    }

    @Test
    void testAveragesWhenZeroComments() {
        //Given
        CalculateStats calculateStats = new CalculateStats(statisticsMock);
        int numberOfPosts = 130;
        int numberOfComments = 0;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(26, calculateStats.getAveragePostsPerUser());
        assertEquals(0, calculateStats.getAverageCommentsPerUser());
        assertEquals(0, calculateStats.getAverageCommentsPerPost());
    }

    @Test
    void testAveragesWhenCommentsLessThanPosts() {
        //Given
        CalculateStats calculateStats = new CalculateStats(statisticsMock);
        int numberOfPosts = 55;
        int numberOfComments = 11;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(11, calculateStats.getAveragePostsPerUser());
        assertEquals(2.2, calculateStats.getAverageCommentsPerUser());
        assertEquals(0.2, calculateStats.getAverageCommentsPerPost());
    }

    @Test
    void testAveragesWhenCommentsMoreThanPosts() {
        //Given
        CalculateStats calculateStats = new CalculateStats(statisticsMock);
        int numberOfPosts = 4;
        int numberOfComments = 10000;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.8, calculateStats.getAveragePostsPerUser());
        assertEquals(2000, calculateStats.getAverageCommentsPerUser());
        assertEquals(2500, calculateStats.getAverageCommentsPerPost());
    }

    @Test
    void testAveragesWhen0Users() {
        //Given
        List<String> userNames = Arrays.asList();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);
        int numberOfPosts = 5;
        int numberOfComments = 5;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStats.getAveragePostsPerUser());
        assertEquals(0, calculateStats.getAverageCommentsPerUser());
        assertEquals(1, calculateStats.getAverageCommentsPerPost());
    }

    @Test
    void testAveragesWhen100Users() {
        //Given
        List<String> userNames = new ArrayList<>();
        for (int i=1; i < 101; i++) {
            userNames.add("user" + i);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        CalculateStats calculateStats = new CalculateStats(statisticsMock);
        int numberOfPosts = 100;
        int numberOfComments = 5000;
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);

        //When
        calculateStats.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1, calculateStats.getAveragePostsPerUser());
        assertEquals(50, calculateStats.getAverageCommentsPerUser());
        assertEquals(50, calculateStats.getAverageCommentsPerPost());
    }
}