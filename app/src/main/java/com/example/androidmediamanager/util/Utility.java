package com.example.androidmediamanager.util;

import java.util.HashMap;

public class Utility {

  private final HashMap<String, String> params;

  public Utility() {
    this.params = new HashMap<String, String>();
  }

  public Utility(HashMap<String, String> params) {
    this.params = params;
  }

  public HashMap<String, String> getParams() {
    return params;
  }


}

