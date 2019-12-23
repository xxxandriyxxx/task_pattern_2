package com.epam.model;

import java.util.List;

public interface Model {

    void createNewTask();

    List<Task> getTaskList();

    Task getSelectedTask();

    void setSelectedTask(int index);

    void toDo();

    void inProgress();

    void codeReview();

    void done();

}
