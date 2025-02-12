package com.example.personaltodo;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.asLiveData;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.viewModelScope;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlinx.coroutines.launch;

public class ToDoViewModel extends ViewModel {
    pri...