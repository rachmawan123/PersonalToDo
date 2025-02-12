package com.example.personaltodo;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "todo_table")
public class ToDo {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String title;
    public String description;
    public boolean isCompleted;
    public long reminderTime;

    public ToDo(String title, String description, boolean isCompleted, long reminderTime) {
        this.title = title;
        th...