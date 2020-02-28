package com.example.androidmediamanager.models;

import java.time.LocalDate;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

abstract class Media {

  private String connectorName;
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

  public Media() {
  }

  public Media(String connectorName, String description, String titleName,
      List<Float> ratings, List<Review> reviews, String providerLink, String source,
      List<Image> images, String runtime, Subtitle subtitle,
      List<String> languages, List<Person> actors,
      List<Person> directors, List<Genre> genres, LocalDate releaseDate, String id) {
    this.connectorName = connectorName;
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

  public String getConnectorName() {
    return connectorName;
  }

  public void setConnectorName(String connectorName) {
    this.connectorName = connectorName;
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

    try {
      jo.put("connectorName", connectorName);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }


  public Media withConnectorName(String connectorName) {
    this.connectorName = connectorName;
    return this;
  }

  public Media withDescription(String description) {
    this.description = description;
    return this;
  }

  public Media withTitleName(String titleName) {
    this.titleName = titleName;
    return this;
  }

  public Media withRatings(List<Float> ratings) {
    this.ratings = ratings;
    return this;
  }

  public Media withReviews(List<Review> reviews) {
    this.reviews = reviews;
    return this;
  }

  public Media withProviderLink(String providerLink) {
    this.providerLink = providerLink;
    return this;
  }

  public Media withSource(String source) {
    this.source = source;
    return this;
  }

  public Media withImages(List<Image> images) {
    this.images = images;
    return this;
  }

  public Media withRuntime(String runtime) {
    this.runtime = runtime;
    return this;
  }

  public Media withSubtitle(Subtitle subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  public Media withLanguages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public Media withActors(List<Person> actors) {
    this.actors = actors;
    return this;
  }

  public Media withDirectors(List<Person> directors) {
    this.directors = directors;
    return this;
  }

  public Media withGenres(List<Genre> genres) {
    this.genres = genres;
    return this;
  }

  public Media withReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  public Media withId(String id) {
    this.id = id;
    return this;
  }

}


