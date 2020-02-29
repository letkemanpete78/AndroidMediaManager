package com.example.androidmediamanager.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
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

  @ColumnInfo(name = "headerPairs")
  private String headerPairs;
  @ColumnInfo(name = "bodyPairs")
  private String bodyPairs;
  @ColumnInfo(name = "urlPairs")
  private String urlPairs;

  private transient NVP headerNVP;
  private transient NVP bodyNVP;
  private transient NVP urlNVP;


  public Config(Long id, String name, String url, Byte sortOrder, Boolean isActive,
      String headerPairs, String bodyPairs, String urlPairs,
      NVP headerNVP, NVP bodyNVP, NVP urlNVP) {
    this.id = id;
    this.name = name;
    this.url = url;
    this.sortOrder = sortOrder;
    this.isActive = isActive;
    this.headerPairs = headerPairs;
    this.bodyPairs = bodyPairs;
    this.urlPairs = urlPairs;
    this.headerNVP = headerNVP;
    this.bodyNVP = bodyNVP;
    this.urlNVP = urlNVP;
  }

  @Override
  public String toString() {
    return "Config{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", url='" + url + '\'' +
        ", sortOrder=" + sortOrder +
        ", isActive=" + isActive +
        ", headerPairs='" + headerPairs + '\'' +
        ", bodyPairs='" + bodyPairs + '\'' +
        ", urlPairs='" + urlPairs + '\'' +
        ", headerNVP=" + headerNVP +
        ", bodyNVP=" + bodyNVP +
        ", urlNVP=" + urlNVP +
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
        .append(sortOrder, config.sortOrder)
        .append(isActive, config.isActive)
        .append(headerPairs, config.headerPairs)
        .append(bodyPairs, config.bodyPairs)
        .append(urlPairs, config.urlPairs)
        .append(headerNVP, config.headerNVP)
        .append(bodyNVP, config.bodyNVP)
        .append(urlNVP, config.urlNVP)
        .isEquals();
  }

  public Config() {
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
        .append(headerNVP)
        .append(bodyNVP)
        .append(urlNVP)
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

  public NVP getHeaderNVP() {
    return headerNVP;
  }

  public void setHeaderNVP(NVP headerNVP) {
    this.headerPairs = NVP.asJsonString(headerNVP.getDataSet(headerNVP), "header");
    this.headerNVP = headerNVP;
  }

  public NVP getBodyNVP() {
    return bodyNVP;
  }

  public void setBodyNVP(NVP bodyNVP) {
    this.bodyPairs = NVP.asJsonString(headerNVP.getDataSet(bodyNVP), "body");
    this.bodyNVP = bodyNVP;
  }

  public NVP getUrlNVP() {
    return urlNVP;
  }

  public void setUrlNVP(NVP urlNVP) {
    this.urlPairs = NVP.asJsonString(urlNVP.getDataSet(urlNVP), "url");
    this.urlNVP = urlNVP;
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
    return jo;
  }
}
