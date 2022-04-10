package com.kodilla.spring.portfolio;

public class Board {

    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void printToDoList() {
        System.out.println(toDoList.toString());
    }

    public void printInProgressList() {
        System.out.println(inProgressList.toString());
    }

    public void printDoneList() {
        System.out.println(doneList.toString());
    }
}
