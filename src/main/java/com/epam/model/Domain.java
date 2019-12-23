package com.epam.model;

import java.util.ArrayList;
import java.util.List;

public class Domain {

    private List<Task> taskList;

    public Domain() {
        taskList = new ArrayList<>();
    }

    public Task createNewTask() {
        Task task = new Task();
        taskList.add(task);
        return task;
    }

    public void setTask(int index, Task task) {
        taskList.set(index, task);
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}
