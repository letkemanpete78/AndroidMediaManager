package com.example.androidmediamanager.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.json.JSONException;
import org.json.JSONObject;

@Entity
public class ConfigMaster {

  @PrimaryKey
  private Long id;
  @ColumnInfo(name = "name")
  private String name;
  @ColumnInfo(name = "url")
  private String url;

  @ColumnInfo(name = "sortOrder")
  private Byte sortOrder;
  @ColumnInfo(name = "isActive")
  private Boolean isActive;

  @ColumnInfo(name = "headerPairs")
  private String headerPairs;
  @ColumnInfo(name = "bodyPairs")
  private String bodyPairs;
  @ColumnInfo(name = "urlPairs")
  private String urlPairs;


  private Context context;

  public ConfigMaster(Long id, String name, String url, Byte sortOrder, Boolean isActive,
      String headerPairs, String bodyPairs, String urlPairs) {
    this.id = id;
    this.name = name;
    this.url = url;
    this.sortOrder = sortOrder;
    this.isActive = isActive;
    this.headerPairs = headerPairs;
    this.bodyPairs = bodyPairs;
    this.urlPairs = urlPairs;

  }

  public ConfigMaster() {
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

    ConfigMaster configMaster = (ConfigMaster) o;

    return new EqualsBuilder()
        .append(id, configMaster.id)
        .append(name, configMaster.name)
        .append(url, configMaster.url)
        .append(sortOrder, configMaster.sortOrder)
        .append(isActive, configMaster.isActive)
        .append(headerPairs, configMaster.headerPairs)
        .append(bodyPairs, configMaster.bodyPairs)
        .append(urlPairs, configMaster.urlPairs)

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

  public String getHeaderPairs() {
    return headerPairs;
  }

  public void setHeaderPairs(String headerPairs) {
    this.headerPairs = headerPairs;
  }

  public String getBodyPairs() {
    return bodyPairs;
  }

  public void setBodyPairs(String bodyPairs) {
    this.bodyPairs = bodyPairs;
  }

  public String getUrlPairs() {
    return urlPairs;
  }

  public void setUrlPairs(String urlPairs) {
    this.urlPairs = urlPairs;
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(id)
        .append(name)
        .append(url)
        .append(sortOrder)
        .append(isActive)
        .append(headerPairs)
        .append(bodyPairs)
        .append(urlPairs)

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
    try {
      jo.put("headerPairs", headerPairs);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("bodyPairs", bodyPairs);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("urlPairs", urlPairs);
    } catch (JSONException e) {
      e.printStackTrace();
    }

    return jo;
  }

  public void testInsert(Context context) {
    ConfigDB db = new ConfigDB(context);
    SQLiteDatabase database = db.getWritableDatabase();
    db.insert(database);
  }

  public class ConfigDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "config.db";
    public static final String TABLE_NAME = "config";
    public static final int VERSION = 2;
    private ContentValues contentValues;

    public ConfigDB(@Nullable Context context) {
      super(context, DB_NAME, null, VERSION);
      contentValues = new ContentValues();

      contentValues.put("host", "http://www.omdbapi.com");
      contentValues.put("apiKey", "1273ff27");
      contentValues.put("operation", "s");
      contentValues.put("searchValue", "Avengers");
      contentValues.put("url", "http://www.omdbapi.com?apikey=1273ff27&s=Avengers");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
      db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME
          + " (id INTEGER primary key,  searchValue text ,   host text ,  operation text,  apiKey text,  url text)");
      db.insert(TABLE_NAME, null, contentValues);
    }

    public int insert(SQLiteDatabase db) {

      return (int) db.insert(TABLE_NAME, null, contentValues);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
      db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
      onCreate(db);
    }
  }
}
