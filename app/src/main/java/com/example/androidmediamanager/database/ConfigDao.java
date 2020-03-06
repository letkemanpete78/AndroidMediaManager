package com.example.androidmediamanager.database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.androidmediamanager.models.Config;
import java.util.List;

public interface ConfigDao {

  @Query("SELECT id,name,url,sortOrder,isActive,headerStr,bodyStr,urlStr from Config")
  List<Config> getAll();

  @Query("SELECT id,name,url,sortOrder,isActive,headerStr,bodyStr,urlStr from Config where id = :id")
  Config getOneById(String id);

  @Query("SELECT id,name,url,sortOrder,isActive,headerStr,bodyStr,urlStr from Config where id in (:id)")
  List<Config> getManyById(String[] id);

  @Insert
  void insert(Config config);

  @Delete
  void delete(Config config);

  @Insert
  void initalizeDB(Config[] configs);
}
