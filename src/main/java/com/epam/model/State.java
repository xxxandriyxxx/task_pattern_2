package com.epam.model;

public interface State {

    default void toDo(Task task){
        System.out.println("'to do' - is not allowed!");
    }

    default void inProgress(Task task){
        System.out.println("'in progress' - is not allowed!");
    }

    default void codeReview(Task task){
        System.out.println("'code review' - is not allowed!");
    }

    default void done(Task task){
        System.out.println("'done' - is not allowed!");
    }
}
