package com.epam.controller;

import com.epam.model.BusinessLogic;
import com.epam.model.Task;

import java.util.List;

public class ControllerImpl implements Controller {

    private BusinessLogic businessLogic;

    public ControllerImpl() {
        businessLogic = new BusinessLogic();
    }

    @Override
    public Task createNewTask() {
        return businessLogic.createNewTask();
    }

    @Override
    public List<Task> getTaskList() {
        return businessLogic.getTaskList();
    }

    @Override
    public Task getSelectedTask() {
        return businessLogic.getSelectedTask();
    }

    @Override
    public void setSelectedTask(int index) {
        businessLogic.setSelectedTask(index);
    }

    @Override
    public void toDo() {
        businessLogic.toDo();
    }

    @Override
    public void inProgress() {
        businessLogic.inProgress();
    }

    @Override
    public void codeReview() {
        businessLogic.codeReview();
    }

    @Override
    public void done() {
        businessLogic.done();
    }
}
