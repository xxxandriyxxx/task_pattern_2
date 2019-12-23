package com.epam.model.stateImpl;

import com.epam.model.State;
import com.epam.model.Task;

public class ToDoState implements State {

    @Override
    public void inProgress(Task task) {
        task.setState(new InProgressState());
        System.out.println("Set state 'inProgress'");
    }
}
