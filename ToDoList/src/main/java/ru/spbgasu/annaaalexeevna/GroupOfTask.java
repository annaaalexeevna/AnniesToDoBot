package ru.spbgasu.annaaalexeevna;

import java.util.ArrayList;

public class GroupOfTask {
    private String nameGroup;
    private ArrayList<TaskList> taskListGroup = new ArrayList<TaskList>();

    public GroupOfTask (String nameGroup) {
        this.nameGroup = nameGroup;
    }
}
