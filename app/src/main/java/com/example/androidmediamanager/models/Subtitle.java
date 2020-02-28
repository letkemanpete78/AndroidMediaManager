package com.example.androidmediamanager.models;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

final class Subtitle {

  private File subtitle;
  private String language;

  Subtitle() {
  }

  Subtitle(File subtitle, String language) {
    this.subtitle = subtitle;
    this.language = language;
  }

  private Subtitle(Builder builder) {
    setSubtitle(builder.subtitle);
    setLanguage(builder.language);
  }

  File getSubtitle() {
    return subtitle;
  }

  void setSubtitle(File subtitle) {
    this.subtitle = subtitle;
  }

  String getLanguage() {
    return language;
  }

  void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public String toString() {
    return "Subtitle{" +
        "subtitle=" + subtitle +
        ", language='" + language + '\'' +
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

    Subtitle subtitle1 = (Subtitle) o;

    if (!Objects.equals(subtitle, subtitle1.subtitle)) {
      return false;
    }
    return Objects.equals(language, subtitle1.language);
  }

  @Override
  public int hashCode() {
    int result = subtitle != null ? subtitle.hashCode() : 0;
    result = 31 * result + (language != null ? language.hashCode() : 0);
    return result;
  }

  // create by build json plugin
  JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("subtitle", subtitle);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("language", language);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }

  /**
   * {@code Subtitle} builder static inner class.
   */
  static final class Builder {

    private File subtitle;
    private String language;

    Builder() {
    }

    Builder(Subtitle copy) {
      this.subtitle = copy.getSubtitle();
      this.language = copy.getLanguage();
    }

    /**
     * Sets the {@code subtitle} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code subtitle} to set
     * @return a reference to this Builder
     */
    Builder withSubtitle(File val) {
      subtitle = val;
      return this;
    }

    /**
     * Sets the {@code language} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code language} to set
     * @return a reference to this Builder
     */
    Builder withLanguage(String val) {
      language = val;
      return this;
    }

    /**
     * Returns a {@code Subtitle} built from the parameters previously set.
     *
     * @return a {@code Subtitle} built with parameters of this {@code Subtitle.Builder}
     */
    Subtitle build() {
      return new Subtitle(this);
    }
  }
}
