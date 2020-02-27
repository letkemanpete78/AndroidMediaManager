package com.example.androidmediamanager.models;

import org.json.JSONException;
import org.json.JSONObject;

class Image {

  private String url;
  private Boolean isPrimary;

  Image(String URL, Boolean isPrimary) {
    this.url = URL;
    this.isPrimary = isPrimary;
  }

  Image() {
  }


  private Image(Builder builder) {
    isPrimary = builder.isPrimary;
    url = builder.Url;
  }

  String getUrl() {
    return url;
  }

  void setUrl(String url) {
    this.url = url;
  }

  Boolean isPrimary() {
    return isPrimary;
  }

  void setPrimary(Boolean primary) {
    isPrimary = primary;
  }

  // create by build json plugin
  JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("url", url);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("isPrimary", isPrimary);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }

  @Override
  public String toString() {
    return toJson().toString();
  }


  /**
   * {@code Image} builder static inner class.
   */
  static final class Builder {

    private Boolean isPrimary;
    private String Url;

    Builder() {
    }


    Builder(Image copy) {
      this.isPrimary = copy.isPrimary();
      this.Url = copy.getUrl();
    }

    /**
     * Sets the {@code isPrimary} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code isPrimary} to set
     * @return a reference to this Builder
     */
    Builder withIsPrimary(Boolean val) {
      isPrimary = val;
      return this;

    }


    Builder withURL(String Url) {
      this.Url = Url;
      return this;
    }

    /**
     * Returns a {@code Image} built from the parameters previously set.
     *
     * @return a {@code Image} built with parameters of this {@code Image.Builder}
     */
    Image build() {
      return new Image(this);
    }
  }
}
