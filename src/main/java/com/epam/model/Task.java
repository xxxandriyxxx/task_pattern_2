package com.epam.model;

import com.epam.model.stateImpl.ToDoState;

public class Task {

    private static int counter = 0;
    private int taskNumber;
    private State state;

    public Task() {
        counter++;
        taskNumber = counter;
        state = new ToDoState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void toDo() {
        state.toDo(this);
    }

    public void inProgress() {
        state.inProgress(this);
    }

    public void codeReview() {
        state.codeReview(this);
    }

    public void done() {
        state.done(this);
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Task" + taskNumber;
    }
}
