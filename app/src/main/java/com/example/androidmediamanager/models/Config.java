package com.example.androidmediamanager.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.LinkedHashMap;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Entity
public class Config {

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

  @ColumnInfo(name = "headerNVP")
  private LinkedHashMap<String, String> headerNVP;
  @ColumnInfo(name = "bodyNVP")
  private LinkedHashMap<String, String> bodyNVP;
  @ColumnInfo(name = "urlNVP")
  private LinkedHashMap<String, String> urlNVP;


  public Config() {
  }

  public Config(Long id, String name, String url,
      LinkedHashMap<String, String> headerNVP,
      LinkedHashMap<String, String> bodyNVP,
      LinkedHashMap<String, String> urlNVP, Byte sortOrder, Boolean active) {
    this.id = id;
    this.name = name;
    this.url = url;
    this.headerNVP = headerNVP;
    this.bodyNVP = bodyNVP;
    this.urlNVP = urlNVP;
    this.sortOrder = sortOrder;
    this.isActive = active;
  }


  @NotNull
  @Override
  public String toString() {
    return "Config{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", url='" + url + '\'' +
        ", headerNVP=" + headerNVP +
        ", bodyNVP=" + bodyNVP +
        ", urlNVP=" + urlNVP +
        ", sortOrder=" + sortOrder +
        ", active=" + isActive +
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

    Config config = (Config) o;

    return new EqualsBuilder()
        .append(id, config.id)
        .append(name, config.name)
        .append(url, config.url)
        .append(headerNVP, config.headerNVP)
        .append(bodyNVP, config.bodyNVP)
        .append(urlNVP, config.urlNVP)
        .append(sortOrder, config.sortOrder)
        .append(isActive, config.isActive)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(id)
        .append(name)
        .append(url)
        .append(headerNVP)
        .append(bodyNVP)
        .append(urlNVP)
        .append(sortOrder)
        .append(isActive)
        .toHashCode();
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

  public LinkedHashMap<String, String> getHeaderNVP() {
    return headerNVP;
  }

  public void setHeaderNVP(LinkedHashMap<String, String> headerNVP) {
    this.headerNVP = headerNVP;
  }

  public LinkedHashMap<String, String> getBodyNVP() {
    return bodyNVP;
  }

  public void setBodyNVP(LinkedHashMap<String, String> bodyNVP) {
    this.bodyNVP = bodyNVP;
  }

  public LinkedHashMap<String, String> getUrlNVP() {
    return urlNVP;
  }

  public void setUrlNVP(LinkedHashMap<String, String> urlNVP) {
    this.urlNVP = urlNVP;
  }

  public Byte getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Byte sortOrder) {
    this.sortOrder = sortOrder;
  }

  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
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
      jo.put("headerNVP", headerNVP);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("bodyNVP", bodyNVP);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("urlNVP", urlNVP);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("sortOrder", sortOrder);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("active", isActive);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }
}
