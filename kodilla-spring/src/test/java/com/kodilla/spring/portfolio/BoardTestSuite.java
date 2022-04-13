package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        board.printDoneList();
        board.printInProgressList();
        board.printToDoList();
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.doneList.addTask("addedRecordTo - doneList");
        board.inProgressList.addTask("addedRecordTo - inProgressList");
        board.toDoList.addTask("addedRecordTo - toDoList");

        //Then
        assertEquals("addedRecordTo - doneList", board.doneList.toString());
        assertEquals("addedRecordTo - inProgressList", board.inProgressList.toString());
        assertEquals("addedRecordTo - toDoList", board.toDoList.toString());
    }
}
