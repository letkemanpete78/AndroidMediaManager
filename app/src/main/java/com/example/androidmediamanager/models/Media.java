package com.example.androidmediamanager.models;

import android.media.Rating;
import java.time.LocalDate;
import java.util.List;
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

  Media() {
  }

  Media(String description, String titleName, List<Float> ratings,
      List<Review> reviews, String providerLink, String source,
      List<Image> images, String runtime, Subtitle subtitle,
      List<String> languages, List<Person> actors,
      List<Person> directors, List<Genre> genres, LocalDate releaseDate) {
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
  }

  String getDescription() {
    return description;
  }

  void setDescription(String description) {
    this.description = description;
  }

  String getTitleName() {
    return titleName;
  }

  void setTitleName(String titleName) {
    this.titleName = titleName;
  }

  List<Float> getRatings() {
    return ratings;
  }

  void setRatings(List<Float> ratings) {
    this.ratings = ratings;
  }

  List<Review> getReviews() {
    return reviews;
  }

  void setReviews(List<Review> reviews) {
    this.reviews = reviews;
  }

  String getProviderLink() {
    return providerLink;
  }

  void setProviderLink(String providerLink) {
    this.providerLink = providerLink;
  }

  String getSource() {
    return source;
  }

  void setSource(String source) {
    this.source = source;
  }

  List<Image> getImages() {
    return images;
  }

  void setImages(List<Image> images) {
    this.images = images;
  }

  String getRuntime() {
    return runtime;
  }

  void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  Subtitle getSubtitle() {
    return subtitle;
  }

  void setSubtitle(Subtitle subtitle) {
    this.subtitle = subtitle;
  }

  List<String> getLanguages() {
    return languages;
  }

  void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  List<Person> getActors() {
    return actors;
  }

  void setActors(List<Person> actors) {
    this.actors = actors;
  }

  List<Person> getDirectors() {
    return directors;
  }

  void setDirectors(List<Person> directors) {
    this.directors = directors;
  }

  List<Genre> getGenres() {
    return genres;
  }

  void setGenres(List<Genre> genres) {
    this.genres = genres;
  }

  LocalDate getReleaseDate() {
    return releaseDate;
  }

  void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

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

    Media media = (Media) o;

    if (description != null ? !description.equals(media.description) : media.description != null) {
      return false;
    }
    if (titleName != null ? !titleName.equals(media.titleName) : media.titleName != null) {
      return false;
    }
    if (ratings != null ? !ratings.equals(media.ratings) : media.ratings != null) {
      return false;
    }
    if (reviews != null ? !reviews.equals(media.reviews) : media.reviews != null) {
      return false;
    }
    if (providerLink != null ? !providerLink.equals(media.providerLink)
        : media.providerLink != null) {
      return false;
    }
    if (source != null ? !source.equals(media.source) : media.source != null) {
      return false;
    }
    if (images != null ? !images.equals(media.images) : media.images != null) {
      return false;
    }
    if (runtime != null ? !runtime.equals(media.runtime) : media.runtime != null) {
      return false;
    }
    if (subtitle != null ? !subtitle.equals(media.subtitle) : media.subtitle != null) {
      return false;
    }
    if (languages != null ? !languages.equals(media.languages) : media.languages != null) {
      return false;
    }
    if (actors != null ? !actors.equals(media.actors) : media.actors != null) {
      return false;
    }
    if (directors != null ? !directors.equals(media.directors) : media.directors != null) {
      return false;
    }
    if (genres != null ? !genres.equals(media.genres) : media.genres != null) {
      return false;
    }
    return releaseDate != null ? releaseDate.equals(media.releaseDate) : media.releaseDate == null;
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
    return result;
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
    return jo;
  }

  static final class MediaBuilder {

    private String description;
    private String titleName;
    private List<Rating> ratings;
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

    private MediaBuilder() {
    }

    static MediaBuilder aMedia() {
      return new MediaBuilder();
    }

    MediaBuilder withDescription(String description) {
      this.description = description;
      return this;
    }

    MediaBuilder withTitleName(String titleName) {
      this.titleName = titleName;
      return this;
    }

    MediaBuilder withRatings(List<Rating> ratings) {
      this.ratings = ratings;
      return this;
    }

    MediaBuilder withReviews(List<Review> reviews) {
      this.reviews = reviews;
      return this;
    }

    MediaBuilder withProviderLink(String providerLink) {
      this.providerLink = providerLink;
      return this;
    }

    MediaBuilder withSource(String source) {
      this.source = source;
      return this;
    }

    MediaBuilder withImages(List<Image> images) {
      this.images = images;
      return this;
    }

    MediaBuilder withRuntime(String runtime) {
      this.runtime = runtime;
      return this;
    }

    MediaBuilder withSubtitle(Subtitle subtitle) {
      this.subtitle = subtitle;
      return this;
    }

    MediaBuilder withLanguages(List<String> languages) {
      this.languages = languages;
      return this;
    }

    MediaBuilder withActors(List<Person> actors) {
      this.actors = actors;
      return this;
    }

    MediaBuilder withDirectors(List<Person> directors) {
      this.directors = directors;
      return this;
    }

    MediaBuilder withGenres(List<Genre> genres) {
      this.genres = genres;
      return this;
    }

    MediaBuilder withReleaseDate(LocalDate releaseDate) {
      this.releaseDate = releaseDate;
      return this;
    }

  }
}
