package com.epam.model.stateImpl;

import com.epam.model.State;
import com.epam.model.Task;

public class InProgressState implements State {

    @Override
    public void toDo(Task task) {
        task.setState(new ToDoState());
        logger.info("Set state 'toDo'");
    }

    @Override
    public void codeReview(Task task) {
        task.setState(new CodeReviewState());
        logger.info("Set state 'codeReview'");
    }

    @Override
    public String toString() {
        return "InProgressState";
    }
}
