package com.example.androidmediamanager.database;

import androidx.room.Query;
import com.example.androidmediamanager.models.Config;
import java.util.List;

public interface ConfigDao {

  //@Query("SELECT id,name,url,headerNVP,bodyNVP,urlNVP,sortOrder, isActive  from Config");

  @Query("SELECT id,name,url,sortOrder,isActive,headerStr,bodyStr,urlStr from Config")
  List<Config> getAll();
  /*

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
           "last_name LIKE :last LIMIT 1")
    User findByName(String first, String last);

    @Insert
    void insertAll(User... users);

    @Delete
    void delete(User user)
   */


}
