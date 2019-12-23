package com.epam.view;

import com.epam.controller.Controller;
import com.epam.controller.ControllerImpl;
import com.epam.model.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class View {

    private Controller controller;
    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private Scanner input;
    private String keyMenu;
    private Logger logger;

    public View() {
        input = new Scanner(System.in);
        logger = LogManager.getLogger(View.class);
        controller = new ControllerImpl();

        menu = new LinkedHashMap<>();
        menu.put("1", " 1 - create new task");
        menu.put("2", " 2 - show all tasks");
        menu.put("3", " 3 - select the task to work on");
        menu.put("4", " 4 - change state of selected task to 'to do'");
        menu.put("5", " 5 - change state of selected task to 'in progress'");
        menu.put("6", " 6 - change state of selected task to 'code review'");
        menu.put("7", " 7 - change state of selected task to 'done'");
        menu.put("Q", " q - exit");

        methodsMenu = new LinkedHashMap<>();
        methodsMenu.put("1", this::createNewTask);
        methodsMenu.put("2", this::printTaskList);
        methodsMenu.put("3", this::selectWorkTask);
        methodsMenu.put("4", this::toDo);
        methodsMenu.put("5", this::inProgress);
        methodsMenu.put("6", this::codeReview);
        methodsMenu.put("7", this::done);
        methodsMenu.put("Q", this::exit);
    }

    private void createNewTask() {
        Task task = controller.createNewTask();
        logger.info(task + " created!");
    }

    private boolean printTaskList() {
        List<Task> taskList = controller.getTaskList();
        int i = 0;
        if (taskList.isEmpty()) {
            logger.error("No tasks!");
            return false;
        } else {
            for (Task t : taskList) {
                i++;
                logger.info(i + ": " + t + " (state = " + t.getState() + ")");
            }
            return true;
        }
    }

    private void selectWorkTask() {
        boolean tasksExist = printTaskList();
        if (tasksExist) {
            logger.trace("-------------------------");
            logger.trace("Enter the task number:");
            try {
                keyMenu = input.nextLine();
                controller.setSelectedTask(Integer.parseInt(keyMenu) - 1);
            } catch (Exception e) {
                logger.error("You entered the wrong symbol !!!");
            }
        }
    }

    private void toDo() {
        controller.toDo();
    }

    private void inProgress() {
        controller.inProgress();
    }

    private void codeReview() {
        controller.codeReview();
    }

    private void done() {
        controller.done();
    }

    private void exit() {
        System.exit(0);
    }

    private void outputMenu() {
        Task selectedTask = controller.getSelectedTask();
        logger.trace("\n==================== MENU ====================");
        if (selectedTask != null) {
            logger.info("Selected task = " + selectedTask +
                    " (state = " + selectedTask.getState() + ")");
        } else {
            logger.info("No selected task");
        }
        System.out.println("----------------------------------------------");
        for (String str : menu.values()) {
            logger.trace(str);
        }
    }

    public void show() {
        do {
            outputMenu();
            logger.trace("----------------------------------------------");
            logger.trace("Enter the menu point:");
            keyMenu = input.nextLine().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception e) {
                logger.error("You entered the wrong symbol !!!");
            }
        } while (!keyMenu.equals("Q"));
    }
}
