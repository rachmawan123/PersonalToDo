package com.example.personaltodo;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import android.content.Context;

@Database(entities = {ToDo.class}, version = 2, exportSchema = false)
public abstract class ToDoDatabase extends RoomDatabase {
    public abstract ToDoDao toDoDao();
    
    private static volatile ToDoDatabase INSTANCE;

    public static ToDoDatabase getDatabase(final Context context) {
...