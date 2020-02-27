package com.example.androidmediamanager.models;

import org.json.JSONException;
import org.json.JSONObject;

final class Person {

  private String firstName;
  private String lastName;
  private String bio;
  private String id;
  private Image image;

  Person() {
  }

  Person(String firstName, String lastName, String bio, String id,
      Image image) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.bio = bio;
    this.id = id;
    this.image = image;
  }

  private Person(Builder builder) {
    setFirstName(builder.firstName);
    setLastName(builder.lastName);
    setBio(builder.bio);
    setId(builder.id);
    setImage(builder.image);
  }


  String getFirstName() {
    return firstName;
  }

  void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  String getLastName() {
    return lastName;
  }

  void setLastName(String lastName) {
    this.lastName = lastName;
  }

  String getBio() {
    return bio;
  }

  void setBio(String bio) {
    this.bio = bio;
  }

  String getId() {
    return id;
  }

  void setId(String id) {
    this.id = id;
  }

  Image getImage() {
    return image;
  }

  void setImage(Image image) {
    this.image = image;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", bio='" + bio + '\'' +
        ", id='" + id + '\'' +
        ", image=" + image +
        '}';
  }

  // create by build json plugin
  JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("firstName", firstName);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("lastName", lastName);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("bio", bio);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("id", id);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("image", image);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }


  /**
   * {@code Person} builder static inner class.
   */
  static final class Builder {

    private String firstName;
    private String lastName;
    private String bio;
    private String id;
    private Image image;

    Builder() {
    }

    Builder(Person copy) {
      this.firstName = copy.getFirstName();
      this.lastName = copy.getLastName();
      this.bio = copy.getBio();
      this.id = copy.getId();
      this.image = copy.getImage();
    }

    /**
     * Sets the {@code firstName} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code firstName} to set
     * @return a reference to this Builder
     */
    Builder withFirstName(String val) {
      firstName = val;
      return this;
    }

    /**
     * Sets the {@code lastName} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code lastName} to set
     * @return a reference to this Builder
     */
    Builder withLastName(String val) {
      lastName = val;
      return this;
    }

    /**
     * Sets the {@code bio} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code bio} to set
     * @return a reference to this Builder
     */
    Builder withBio(String val) {
      bio = val;
      return this;
    }

    /**
     * Sets the {@code id} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code id} to set
     * @return a reference to this Builder
     */
    Builder withId(String val) {
      id = val;
      return this;
    }

    /**
     * Sets the {@code image} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code image} to set
     * @return a reference to this Builder
     */
    Builder withImage(Image val) {
      image = val;
      return this;
    }

    /**
     * Returns a {@code Person} built from the parameters previously set.
     *
     * @return a {@code Person} built with parameters of this {@code Person.Builder}
     */
    Person build() {
      return new Person(this);
    }
  }
}
