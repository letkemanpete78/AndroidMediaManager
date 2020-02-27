package com.example.androidmediamanager.models;

import java.util.HashMap;
import java.util.Map;

public class DataProvider {

  String name;
  String url;

  static String getSearchAsString(HashMap<String, String> apiParams) {
    StringBuilder retval = new StringBuilder();
    if (apiParams != null && !apiParams.isEmpty()) {
      for (Map.Entry<String, String> entry : apiParams.entrySet()) {
        retval.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
      }
      return retval.toString().substring(0, retval.length() - 1);
    }
    return "";
  }
}
