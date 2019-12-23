package com.epam.impl;

import com.epam.State;
import com.epam.Task;

public class InProgressState implements State {

    @Override
    public void toDo(Task task) {
        task.setState(new ToDoState());
        System.out.println("Set state 'toDo'");
    }

    @Override
    public void codeReview(Task task) {
        task.setState(new CodeReviewState());
        System.out.println("Set state 'codeReview'");
    }

}
