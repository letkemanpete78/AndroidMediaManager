package com.example.androidmediamanager.models;

import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.json.JSONException;
import org.json.JSONObject;

public final class NVP extends LinkedHashMap<String, String> {

  private LinkedHashMap<String, String> dataSet;
  private String name;

  public NVP() {
  }

  public NVP(LinkedHashMap<String, String> dataSet, String name) {
    this.dataSet = dataSet;
    this.name = name;
  }

  /*
    Transform a name value pair into a String object with the
      name value pairs transformed into a string object
      sample:
      LinkedHashMap<String, String> dataSet;
      dataSet.add("name1","value1");
      dataSet.add("name2","value2");
      dataSet.add("name3","value3");
      dataSet.add("name4","value4");
      becomes:
      String value = {"header": {"name1":"value1", "name2":"value2", "name3":"value3", "name4":"value4"}}
     */
  public static String asJsonString(LinkedHashMap<String, String> dataSet, String dataSetName) {
    StringBuilder retval = new StringBuilder();
    if (dataSet != null && !dataSet.isEmpty()) {
      for (Map.Entry<String, String> entry : dataSet.entrySet()) {
        retval.append("{\"").append(entry.getKey()).append("\":\"").append(entry.getValue())
            .append("\"},");
      }
      return "{\"" + dataSetName + "\":" + retval.toString().substring(0, retval.length() - 1)
          + "}";
    }
    return "";

  }

  /*
  String value = {"header": {"name1":"value1", "name2":"value2", "name3":"value3", "name4":"value4"}}
  becomes
      LinkedHashMap<String, String> dataSet;
      dataSet.add("name1","value1");
      dataSet.add("name2","value2");
      dataSet.add("name3","value3");
      dataSet.add("name4","value4");

   */


  public static String nvpAsString(LinkedHashMap<String, String> params) {

    StringBuilder retval = new StringBuilder();
    if (params != null && !params.isEmpty()) {
      for (Map.Entry<String, String> entry : params.entrySet()) {
        retval.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
      }
      return retval.toString().substring(0, retval.length() - 1);
    }
    return "";
  }

  public LinkedHashMap<String, String> getDataSet(
      NVP headerNVP) {
    return dataSet;
  }

  public void setDataSet(LinkedHashMap<String, String> dataSet) {
    this.dataSet = dataSet;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return asJsonString(dataSet, name);
  }

  @
      Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    NVP nvp1 = (NVP) o;

    return new EqualsBuilder()
        .append(dataSet, nvp1.dataSet)
        .isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder(17, 37)
        .append(dataSet)
        .toHashCode();
  }

  public JSONObject toJson(String dataSetName) {
    JSONObject jo = new JSONObject();
    try {
      jo.put(dataSetName, asJsonString(dataSet, dataSetName));
    } catch (JSONException e) {
      e.printStackTrace();
    }
    return jo;
  }
}
