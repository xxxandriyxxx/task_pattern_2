package com.epam.model;

import java.util.List;

public interface Model {

    Task createNewTask();

    List<Task> getTaskList();

    Task getSelectedTask();

    void setSelectedTask(int index);

    void toDo();

    void inProgress();

    void codeReview();

    void done();

}
