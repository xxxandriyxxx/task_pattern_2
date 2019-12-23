package com.epam.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public interface State {

    Logger logger = LogManager.getLogger(State.class);

    default void toDo(Task task) {
        logger.error("'to do' - is not allowed!");
    }

    default void inProgress(Task task) {
        logger.error("'in progress' - is not allowed!");
    }

    default void codeReview(Task task) {
        logger.error("'code review' - is not allowed!");
    }

    default void done(Task task) {
        logger.error("'done' - is not allowed!");
    }
}
