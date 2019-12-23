package com.epam.model;

import java.util.ArrayList;
import java.util.List;

public class Domain {

    private List<Task> taskList;

    public Domain() {
        taskList = new ArrayList<>();
    }

    public void createNewTask() {
        taskList.add(new Task());
    }

    public void setTask(int index, Task task) {
        taskList.set(index, task);
    }

    public List<Task> getTaskList() {
        return taskList;
    }
}
