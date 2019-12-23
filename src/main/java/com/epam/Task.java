package com.epam;

public class Task {

    private static int counter = 0;
    private int taskNumber;
    private State state;

    public Task() {
        counter++;
        taskNumber = counter;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Task" + taskNumber;
    }
}
