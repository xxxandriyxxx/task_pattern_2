package com.epam;

public class Task {

    private static int counter = 0;
    private int taskNumber;

    public Task() {
        counter++;
        taskNumber = counter;
    }

    @Override
    public String toString() {
        return "Task" + taskNumber;
    }
}
