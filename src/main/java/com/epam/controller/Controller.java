package com.epam.controller;

import com.epam.model.Task;

import java.util.List;

public interface Controller {

    Task createNewTask();

    List<Task> getTaskList();

    Task getSelectedTask();

    void setSelectedTask(int index);

    void toDo();

    void inProgress();

    void codeReview();

    void done();
}
