package com.epam.impl;

import com.epam.State;
import com.epam.Task;

public class ToDoState implements State {

    @Override
    public void inProgress(Task task) {
        task.setState(new InProgressState());
        System.out.println("Set state 'inProgress'");
    }
}
