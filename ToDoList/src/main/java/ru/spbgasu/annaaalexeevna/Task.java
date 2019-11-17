package ru.spbgasu.annaaalexeevna;

import org.telegram.telegrambots.meta.api.objects.User;

import java.util.Date;

public class Task {
    private String nameTask;
    private String descriptionTask;
    private User user;
    private Date dateOfEnd;
    private Boolean isReady;

    public Task(String nameTask, String descriptionTask, User user, Date dateOfEnd, boolean isReady) {
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
        this.user = user;
        this.dateOfEnd = dateOfEnd;
        this.isReady = isReady;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public void setIsReady(Boolean isReady) {
        this.isReady = isReady;
    }

    String getNameTask() {
        return nameTask;
    }

    String getDescriptionTask() {
        return descriptionTask;
    }

    User getUser() {
        return user;
    }

    Date getDateOfEnd() {
        return dateOfEnd;
    }

    Boolean getIsReady() {
        return isReady;
    }
}
