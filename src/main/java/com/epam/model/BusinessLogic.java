package com.epam.model;

import java.util.List;

public class BusinessLogic implements Model {

    private Domain domain;
    private Task selectedTask;

    public BusinessLogic() {
        domain = new Domain();
    }

    @Override
    public Task createNewTask() {
        return domain.createNewTask();
    }

    @Override
    public List<Task> getTaskList() {
        return domain.getTaskList();
    }

    @Override
    public Task getSelectedTask() {
        return selectedTask;
    }

    @Override
    public void setSelectedTask(int index) {
        selectedTask = getTaskList().get(index);
    }

    private void changeSelectedTaskState() {
        domain.setTask(selectedTask.getTaskNumber() - 1, selectedTask);
    }

    @Override
    public void toDo() {
        selectedTask.toDo();
        changeSelectedTaskState();
    }

    @Override
    public void inProgress() {
        selectedTask.inProgress();
        changeSelectedTaskState();
    }

    @Override
    public void codeReview() {
        selectedTask.codeReview();
        changeSelectedTaskState();
    }

    @Override
    public void done() {
        selectedTask.done();
        changeSelectedTaskState();
    }
}
