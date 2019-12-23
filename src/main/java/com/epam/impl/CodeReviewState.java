package com.epam.impl;

import com.epam.State;
import com.epam.Task;

public class CodeReviewState implements State {

    @Override
    public void inProgress(Task task) {
        task.setState(new InProgressState());
        System.out.println("Set state 'inProgress'");
    }

    @Override
    public void done(Task task) {
        task.setState(new DoneState());
        System.out.println("Set state 'done'");
    }
}
