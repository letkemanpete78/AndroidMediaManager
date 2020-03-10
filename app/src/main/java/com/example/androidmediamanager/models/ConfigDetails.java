package com.example.androidmediamanager.models;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import java.util.LinkedHashMap;
import java.util.List;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public final class ConfigDetails {

  private long detailsId;
  private long masterId;
  private List<LinkedHashMap<String, String>> attributes;
  private ConfigArea configArea;


  public ConfigDetails() {
  }

  public ConfigDetails(long detailsId, long masterId,
      List<LinkedHashMap<String, String>> attributes,
      ConfigArea configArea) {
    this.detailsId = detailsId;
    this.masterId = masterId;
    this.attributes = attributes;
    this.configArea = configArea;
  }

  @Override
  public String toString() {
    return "ConfigDetails{" +
        "detailsId=" + detailsId +
        ", masterId=" + masterId +
        ", attributes=" + attributes +
        ", configArea=" + configArea +
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

    ConfigDetails that = (ConfigDetails) o;

    return new EqualsBuilder()
        .append(detailsId, that.detailsId)
        .append(masterId, that.masterId)
        .append(attributes, that.attributes)
        .append(configArea, that.configArea)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(detailsId)
        .append(masterId)
        .append(attributes)
        .append(configArea)
        .toHashCode();
  }

  public long getDetailsId() {
    return detailsId;
  }

  public void setDetailsId(long detailsId) {
    this.detailsId = detailsId;
  }

  public long getMasterId() {
    return masterId;
  }

  public void setMasterId(long masterId) {
    this.masterId = masterId;
  }

  public List<LinkedHashMap<String, String>> getAttributes() {
    return attributes;
  }

  public void setAttributes(
      List<LinkedHashMap<String, String>> attributes) {
    this.attributes = attributes;
  }

  public ConfigArea getConfigArea() {
    return configArea;
  }

  public void setConfigArea(ConfigArea configArea) {
    this.configArea = configArea;
  }

  public class ConfigDetailsDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "config.db";
    public static final String CONFIG_MASTER_TABLE = "configMaster";
    public static final String CONFIG_DETAILS_TABLE = "configDetails";
    public static final int VERSION = 4;
    private ContentValues masterValues;
    private ContentValues detailValues;

    public ConfigDetailsDB(@Nullable Context context,
        @Nullable String name,
        @Nullable CursorFactory factory, int version,
        ContentValues masterValues, ContentValues detailValues) {
      super(context, name, factory, version);
      this.masterValues = masterValues;
      this.detailValues = detailValues;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
  }


}
