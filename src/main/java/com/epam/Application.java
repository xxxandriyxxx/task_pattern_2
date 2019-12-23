package com.epam;

import com.epam.model.Task;

public class Application {

    public static void main(String[] args) {
        Task task = new Task();
        task.toDo();
        task.inProgress();
        task.codeReview();
        task.done();
        System.out.println("-----");
        task.toDo();
        task.inProgress();
        task.codeReview();
    }
}
