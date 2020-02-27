package com.example.androidmediamanager.models;

import org.json.JSONException;
import org.json.JSONObject;

class Genre {

  private String genre;
  private Boolean isPrimary;

  public Genre() {
  }

  public Genre(String genre, Boolean isPrimary) {
    this.genre = genre;
    this.isPrimary = isPrimary;
  }

  private Genre(Builder builder) {
    setGenre(builder.genre);
    isPrimary = builder.isPrimary;
  }

  String getGenre() {
    return genre;
  }

  void setGenre(String genre) {
    this.genre = genre;
  }

  Boolean getPrimary() {
    return isPrimary;
  }

  void setPrimary(Boolean primary) {
    isPrimary = primary;
  }

  // create by build json plugin
  JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("genre", genre);
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
   * {@code Genre} builder static inner class.
   */
  public static final class Builder {

    private String genre;
    private Boolean isPrimary;

    public Builder() {
    }

    public Builder(Genre copy) {
      this.genre = copy.getGenre();
      this.isPrimary = copy.getPrimary();
    }

    /**
     * Sets the {@code genre} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code genre} to set
     * @return a reference to this Builder
     */
    public Builder withGenre(String val) {
      genre = val;
      return this;
    }

    /**
     * Sets the {@code isPrimary} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code isPrimary} to set
     * @return a reference to this Builder
     */
    public Builder withIsPrimary(Boolean val) {
      isPrimary = val;
      return this;
    }

    /**
     * Returns a {@code Genre} built from the parameters previously set.
     *
     * @return a {@code Genre} built with parameters of this {@code Genre.Builder}
     */
    public Genre build() {
      return new Genre(this);
    }
  }
}
