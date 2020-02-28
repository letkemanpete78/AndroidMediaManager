
package com.example.androidmediamanager.providers.omdb;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Source",
    "Value"
})
public class Rating {

  @JsonProperty("Source")
  private String source;
  @JsonProperty("Value")
  private String value;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   */
  public Rating() {
  }

  /**
   *
   */
  public Rating(String source, String value) {
    super();
    this.source = source;
    this.value = value;
  }

  @JsonProperty("Source")
  public String getSource() {
    return source;
  }

  @JsonProperty("Source")
  public void setSource(String source) {
    this.source = source;
  }

  @JsonProperty("Value")
  public String getValue() {
    return value;
  }

  @JsonProperty("Value")
  public void setValue(String value) {
    this.value = value;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this).append("source", source).append("value", value)
        .append("additionalProperties", additionalProperties).toString();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().append(source).append(additionalProperties).append(value)
        .toHashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (!(other instanceof Rating)) {
      return false;
    }
    Rating rhs = ((Rating) other);
    return new EqualsBuilder().append(source, rhs.source)
        .append(additionalProperties, rhs.additionalProperties).append(value, rhs.value).isEquals();
  }

}
