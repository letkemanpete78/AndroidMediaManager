package com.example.androidmediamanager.providers.imdb;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.json.JSONException;
import org.json.JSONObject;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({
    "Title",
    "Image",
    "Id",
})
public class Imdb {

  @JsonProperty("Title")
  private String title;
  @JsonProperty("Image")
  private String image;
  @JsonProperty("id")
  private String id;


  public Imdb() {
  }

  public Imdb(String title, String image, String id) {
    this.title = title;
    this.image = image;
    this.id = id;
  }

  public Imdb(Imdb copy) {
    this.title = copy.getTitle();
    this.image = copy.getImage();
    this.id = copy.getId();
  }

  @Override
  public String toString() {
    return "Imdb{" +
        "title='" + title + '\'' +
        ", image='" + image + '\'' +
        ", id='" + id + '\'' +
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

    Imdb imdb = (Imdb) o;

    return new EqualsBuilder()
        .append(title, imdb.title)
        .append(image, imdb.image)
        .append(id, imdb.id)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(title)
        .append(image)
        .append(id)
        .toHashCode();
  }

  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  @JsonProperty("image")
  public void setImage(String image) {
    this.image = image;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  // create by build json plugin
  public JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("title", title);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("image", image);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("id", id);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }

  /**
   * Sets the {@code title} and returns a reference to this Builder so that the methods can be
   * chained together.
   *
   * @param val the {@code title} to set
   * @return a reference to this Builder
   */
  public Imdb withTitle(String val) {
    title = val;
    return this;
  }

  /**
   * Sets the {@code image} and returns a reference to this Builder so that the methods can be
   * chained together.
   *
   * @param val the {@code image} to set
   * @return a reference to this Builder
   */
  public Imdb withImage(String val) {
    image = val;
    return this;
  }

  /**
   * Sets the {@code id} and returns a reference to this Builder so that the methods can be chained
   * together.
   *
   * @param val the {@code id} to set
   * @return a reference to this Builder
   */
  public Imdb withId(String val) {
    id = val;
    return this;
  }

}

