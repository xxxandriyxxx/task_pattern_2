package com.epam.model.stateImpl;

import com.epam.model.State;
import com.epam.model.Task;

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

    @Override
    public String toString() {
        return "CodeReviewState";
    }
}
