package ru.spbgasu.annaaalexeevna;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private String nameList;
    private ArrayList<Task> taskList = new ArrayList<Task>();

    public TaskList (String nameList) {
        this.nameList = nameList;
    }
}