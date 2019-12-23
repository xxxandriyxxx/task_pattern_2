package com.epam;

public interface State {

    default void toDo(Task task){
        System.out.println("toDo - is not allowed");
    }

    default void inProgress(Task task){
        System.out.println("inProgress - is not allowed");
    }

    default void codeReview(Task task){
        System.out.println("codeReview - is not allowed");
    }

    default void done(Task task){
        System.out.println("done - is not allowed");
    }
}
