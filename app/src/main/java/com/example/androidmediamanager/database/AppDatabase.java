package com.example.androidmediamanager.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.androidmediamanager.models.Config;

@Database(entities = {Config.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

  public abstract ConfigDao userDao();


}

