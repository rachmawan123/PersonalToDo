package com.example.personaltodo;

import androidx.room.*;
import kotlinx.coroutines.flow.Flow;

@Dao
public interface ToDoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ToDo toDo);

    @Query("SELECT * FROM todo_table ORDER BY id DESC")
    Flow<List<ToDo>> getAllToDos();

    @Update
    void update(ToDo toDo);

    @Delete
    void delete(ToDo toDo);
}