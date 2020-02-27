package com.example.androidmediamanager.models;

import java.time.LocalDate;
import org.json.JSONException;
import org.json.JSONObject;

final class Review {

  private LocalDate date;
  private String review;

  Review() {
  }

  Review(LocalDate date, String review) {
    this.date = date;
    this.review = review;
  }

  private Review(Builder builder) {
    setDate(builder.date);
    setReview(builder.review);
  }

  @Override
  public String toString() {
    return "Review{" +
        "date=" + date +
        ", review='" + review + '\'' +
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

    Review review1 = (Review) o;

    if (date != null ? !date.equals(review1.date) : review1.date != null) {
      return false;
    }
    return review != null ? review.equals(review1.review) : review1.review == null;
  }

  @Override
  public int hashCode() {
    int result = date != null ? date.hashCode() : 0;
    result = 31 * result + (review != null ? review.hashCode() : 0);
    return result;
  }

  LocalDate getDate() {
    return date;
  }

  void setDate(LocalDate date) {
    this.date = date;
  }

  String getReview() {
    return review;
  }

  void setReview(String review) {
    this.review = review;
  }

  // create by build json plugin
  JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("date", date);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("review", review);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }

  /**
   * {@code Review} builder static inner class.
   */
  static final class Builder {

    private LocalDate date;
    private String review;

    Builder() {
    }

    Builder(Review copy) {
      this.date = copy.getDate();
      this.review = copy.getReview();
    }

    /**
     * Sets the {@code date} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code date} to set
     * @return a reference to this Builder
     */
    Builder withDate(LocalDate val) {
      date = val;
      return this;
    }

    /**
     * Sets the {@code review} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code review} to set
     * @return a reference to this Builder
     */
    Builder withReview(String val) {
      review = val;
      return this;
    }

    /**
     * Returns a {@code Review} built from the parameters previously set.
     *
     * @return a {@code Review} built with parameters of this {@code Review.Builder}
     */
    Review build() {
      return new Review(this);
    }
  }
}
