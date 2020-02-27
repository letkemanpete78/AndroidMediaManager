package com.example.androidmediamanager;

import java.util.List;
import org.json.JSONObject;

public interface Search {

  List<JSONObject> getResultsById(String id, String searchParms,
      String header, String body, String url);

  List<JSONObject> getResultsByTitle(String title, String searchParms,
      String header, String body, String url);


}
