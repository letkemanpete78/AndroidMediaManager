package com.example.androidmediamanager.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.droidparts.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigMaster {

  private Long id;
  private String name;
  private String url;
  private Byte sortOrder;
  private Boolean isActive;
  private Context context;

  public ConfigMaster(Long id, String name, String url, Byte sortOrder, Boolean isActive
  ) {
    this.id = id;
    this.name = name;
    this.url = url;
    this.sortOrder = sortOrder;
    this.isActive = isActive;
  }

  public ConfigMaster() {
  }

  public ConfigMaster(Context context) {
  }

  @Override
  public String toString() {
    return "Config{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", url='" + url + '\'' +
        ", sortOrder=" + sortOrder +
        ", isActive=" + isActive +

        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    com.example.androidmediamanager.models.ConfigMaster configMaster = (com.example.androidmediamanager.models.ConfigMaster) o;

    return new EqualsBuilder()
        .append(id, configMaster.id)
        .append(name, configMaster.name)
        .append(url, configMaster.url)
        .append(sortOrder, configMaster.sortOrder)
        .append(isActive, configMaster.isActive)
        .isEquals();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Byte getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Byte sortOrder) {
    this.sortOrder = sortOrder;
  }

  public Boolean getActive() {
    return isActive;
  }

  public void setActive(Boolean active) {
    isActive = active;
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(id)
        .append(name)
        .append(url)
        .append(sortOrder)
        .append(isActive)
        .toHashCode();
  }

  // create by build json plugin
  public JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("id", id);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("name", name);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("url", url);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("sortOrder", sortOrder);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("isActive", isActive);
    } catch (JSONException e) {
      e.printStackTrace();
    }

    return jo;
  }

//  public void testInsert(Context context) {
//    ConfigMaster db = new ConfigMaster(context);
//    SQLiteDatabase database = db.context.openOrCreateDatabase(ConfigMasterDB.DB_NAME,Context.MODE_ENABLE_WRITE_AHEAD_LOGGING,
//        new CursorFactory().newCursor(db.context.))
//    db.insert(database);
//  }

  public static class ConfigMasterDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "config.db";
    public static final String CONFIG_MASTER_TABLE = "configMaster";
    public static final String CONFIG_DETAILS_TABLE = "configDetails";
    public static final int VERSION = 4;
    private ContentValues masterValues;
    private ContentValues detailValues;

    public ConfigMasterDB(@Nullable Context context) {
      super(context, DB_NAME, null, VERSION);
      masterValues = new ContentValues();

      detailValues.put("host", "http://www.omdbapi.com/");
      detailValues.put("apiKey", "1273ff27");
      detailValues.put("operation", "s");

      masterValues.put("operation", "s");
      masterValues.put("searchValue", "Avengers");
      masterValues.put("isActive", true);

      masterValues.put("url", String.format("%s?apikey=%s&%s=%s", masterValues.get("host"),
          masterValues.getAsString("apikey"), masterValues.getAsString("operation"),
          Strings.urlEncode(masterValues.getAsString("searchValue"))));

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL("CREATE TABLE IF NOT EXISTS " + CONFIG_MASTER_TABLE
          + " (masterId INTEGER primary key,  apiKey text,  url text)");
      long masterId = db.insert(CONFIG_MASTER_TABLE, null, masterValues);
      detailValues.put("masterId", masterId);
      db.execSQL("CREATE TABLE IF NOT EXISTS " + CONFIG_DETAILS_TABLE + " "
          + "(detailsId INTEGER primary key,masterId,name,value,configArea)");
    }


    public long insert(SQLiteDatabase db) {
      long masterId = (long) db.insert(CONFIG_MASTER_TABLE, null, masterValues);
      detailValues.put("masterId", masterId);
      return masterId;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("DROP TABLE IF EXISTS " + CONFIG_MASTER_TABLE);
      onCreate(db);
    }
  }
}
