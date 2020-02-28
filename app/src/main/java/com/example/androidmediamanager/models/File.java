package com.example.androidmediamanager.models;

import java.time.LocalDate;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

final public class File {

  private String filePath;
  private LocalDate modifiedDate;
  private String size;

  public File() {
  }

  public File(String filePath, LocalDate modifiedDate, String size) {
    this.filePath = filePath;
    this.modifiedDate = modifiedDate;
    this.size = size;
  }

  public File(Builder builder) {
    setFilePath(builder.filePath);
    setModifiedDate(builder.modifiedDate);
    setSize(builder.size);
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  LocalDate getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(LocalDate modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return "File{" +
        "filePath='" + filePath + '\'' +
        ", modifiedDate=" + modifiedDate +
        ", size='" + size + '\'' +
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

    File file = (File) o;

    if (!Objects.equals(filePath, file.filePath)) {
      return false;
    }
    if (!Objects.equals(modifiedDate, file.modifiedDate)) {
      return false;
    }
    return Objects.equals(size, file.size);
  }

  @Override
  public int hashCode() {
    int result = filePath != null ? filePath.hashCode() : 0;
    result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
    result = 31 * result + (size != null ? size.hashCode() : 0);
    return result;
  }

  // create by build json plugin
  public JSONObject toJson() {
    JSONObject jo = new JSONObject();
    try {
      jo.put("filePath", filePath);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("modifiedDate", modifiedDate);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    try {
      jo.put("size", size);
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }

  /**
   * {@code File} builder static inner class.
   */
  public static final class Builder {

    private String filePath;
    private LocalDate modifiedDate;
    private String size;

    Builder() {
    }

    public Builder(File copy) {
      this.filePath = copy.getFilePath();
      this.modifiedDate = copy.getModifiedDate();
      this.size = copy.getSize();
    }

    /**
     * Sets the {@code filePath} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code filePath} to set
     * @return a reference to this Builder
     */
    public Builder withFilePath(String val) {
      filePath = val;
      return this;
    }

    /**
     * Sets the {@code modifiedDate} and returns a reference to this Builder so that the methods can
     * be chained together.
     *
     * @param val the {@code modifiedDate} to set
     * @return a reference to this Builder
     */
    public Builder withModifiedDate(LocalDate val) {
      modifiedDate = val;
      return this;
    }

    /**
     * Sets the {@code size} and returns a reference to this Builder so that the methods can be
     * chained together.
     *
     * @param val the {@code size} to set
     * @return a reference to this Builder
     */
    public Builder withSize(String val) {
      size = val;
      return this;
    }

    /**
     * Returns a {@code File} built from the parameters previously set.
     *
     * @return a {@code File} built with parameters of this {@code File.Builder}
     */
    public File build() {
      return new File(this);
    }
  }
}
