package com.example.androidmediamanager;

import com.example.androidmediamanager.models.Movie;
import java.util.HashMap;
import java.util.List;

public interface Connector {

  String createRequest(HashMap<String, String> params);

  List<Movie> parseResponse(List<String> strings);

}
