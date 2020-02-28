package com.example.androidmediamanager.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

abstract class Media {

  private String description;
  private String titleName;
  private List<Float> ratings;
  private List<Review> reviews;
  private String providerLink;
  private String source;
  private List<Image> images;
  private String runtime;
  private Subtitle subtitle;
  private List<String> languages;
  private List<Person> actors;
  private List<Person> directors;
  private List<Genre> genres;
  private LocalDate releaseDate;
  private String id;


  Media() {
  }

  Media(String description, String titleName, List<Float> ratings,
      List<Review> reviews, String providerLink, String source,
      List<Image> images, String runtime, Subtitle subtitle,
      List<String> languages, List<Person> actors,
      List<Person> directors, List<Genre> genres, LocalDate releaseDate, String id) {
    this.description = description;
    this.titleName = titleName;
    this.ratings = ratings;
    this.reviews = reviews;
    this.providerLink = providerLink;
    this.source = source;
    this.images = images;
    this.runtime = runtime;
    this.subtitle = subtitle;
    this.languages = languages;
    this.actors = actors;
    this.directors = directors;
    this.genres = genres;
    this.releaseDate = releaseDate;
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTitleName() {
    return titleName;
  }

  public void setTitleName(String titleName) {
    this.titleName = titleName;
  }

  public List<Float> getRatings() {
    return ratings;
  }

  public void setRatings(List<Float> ratings) {
    this.ratings = ratings;
  }

  public List<Review> getReviews() {
    return reviews;
  }

  public void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  public String getProviderLink() {
    return providerLink;
  }

  public void setProviderLink(String providerLink) {
    this.providerLink = providerLink;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public List<Image> getImages() {
    return images;
  }

  public void setImages(List<Image> images) {
    this.images = images;
  }

  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public Subtitle getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(Subtitle subtitle) {
    this.subtitle = subtitle;
  }

  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public List<Person> getActors() {
    return actors;
  }

  public void setActors(List<Person> actors) {
    this.actors = actors;
  }

  public List<Person> getDirectors() {
    return directors;
  }

  public void setDirectors(List<Person> directors) {
    this.directors = directors;
  }

  public List<Genre> getGenres() {
    return genres;
  }

  public void setGenres(List<Genre> genres) {
    this.genres = genres;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Media media = (Media) o;

    if (!Objects.equals(description, media.description)) {
      return false;
    }
    if (!Objects.equals(titleName, media.titleName)) {
      return false;
    }
    if (!Objects.equals(ratings, media.ratings)) {
      return false;
    }
    if (!Objects.equals(reviews, media.reviews)) {
      return false;
    }
    if (!Objects.equals(providerLink, media.providerLink)) {
      return false;
    }
    if (!Objects.equals(source, media.source)) {
      return false;
    }
    if (!Objects.equals(images, media.images)) {
      return false;
    }
    if (!Objects.equals(runtime, media.runtime)) {
      return false;
    }
    if (!Objects.equals(subtitle, media.subtitle)) {
      return false;
    }
    if (!Objects.equals(languages, media.languages)) {
      return false;
    }
    if (!Objects.equals(actors, media.actors)) {
      return false;
    }
    if (!Objects.equals(directors, media.directors)) {
      return false;
    }
    if (!Objects.equals(genres, media.genres)) {
      return false;
    }
    if (!Objects.equals(releaseDate, media.releaseDate)) {
      return false;
    }
    return Objects.equals(id, media.id);
  }

  @Override
  public int hashCode() {
    int result = description != null ? description.hashCode() : 0;
    result = 31 * result + (titleName != null ? titleName.hashCode() : 0);
    result = 31 * result + (ratings != null ? ratings.hashCode() : 0);
    result = 31 * result + (reviews != null ? reviews.hashCode() : 0);
    result = 31 * result + (providerLink != null ? providerLink.hashCode() : 0);
    result = 31 * result + (source != null ? source.hashCode() : 0);
    result = 31 * result + (images != null ? images.hashCode() : 0);
    result = 31 * result + (runtime != null ? runtime.hashCode() : 0);
    result = 31 * result + (subtitle != null ? subtitle.hashCode() : 0);
    result = 31 * result + (languages != null ? languages.hashCode() : 0);
    result = 31 * result + (actors != null ? actors.hashCode() : 0);
    result = 31 * result + (directors != null ? directors.hashCode() : 0);
    result = 31 * result + (genres != null ? genres.hashCode() : 0);
    result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
    result = 31 * result + (id != null ? id.hashCode() : 0);
    return result;
  }

  @NotNull
  @Override
  public String toString() {
    return "Media{" +
        "description='" + description + '\'' +
        ", titleName='" + titleName + '\'' +
        ", ratings=" + ratings +
        ", reviews=" + reviews +
        ", providerLink='" + providerLink + '\'' +
        ", source='" + source + '\'' +
        ", images=" + images +
        ", runtime='" + runtime + '\'' +
        ", subtitle=" + subtitle +
        ", languages=" + languages +
        ", actors=" + actors +
        ", directors=" + directors +
        ", genres=" + genres +
        ", releaseDate=" + releaseDate +
        ", id='" + id + '\'' +
        '}';
  }

  // create by build json plugin
  public JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("description", description);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("titleName", titleName);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    for (Float r : ratings) {
      try {
        jo.accumulate("ratings", r);
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
    for (Review r : reviews) {
      try {
        jo.accumulate("reviews", r.toJson());
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
    try {
      jo.put("providerLink", providerLink);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("source", source);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    for (Image i : images) {
      try {
        jo.accumulate("images", i.toJson());
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
    try {
      jo.put("runtime", runtime);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("subtitle", subtitle);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    for (String l : languages) {
      try {
        jo.accumulate("languages", l);
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
    for (Person a : actors) {
      try {
        jo.accumulate("actors", a.toJson());
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
    for (Person d : directors) {
      try {
        jo.accumulate("directors", d.toJson());
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
    for (Genre g : genres) {
      try {
        jo.accumulate("genres", g.toJson());
      } catch (JSONException e) {
        e.printStackTrace();
      }
    }
    try {
      jo.put("releaseDate", releaseDate);
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
}
