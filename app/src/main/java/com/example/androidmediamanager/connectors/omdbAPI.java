package com.example.androidmediamanager.connectors;

import android.os.AsyncTask;
import android.util.Log;
import com.example.androidmediamanager.Connector;
import com.example.androidmediamanager.models.Movie;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class omdbAPI extends AsyncTask<URL, Integer, Long> implements Connector {

  private static String CONNECTOR_NAME = "omdbAPI";

  final OkHttpClient client = new OkHttpClient();
  final String host = "http://www.omdbapi.com";
  final String apiKey = "1273ff27";
  private String name;
  private String url;

  public omdbAPI() {
    doInBackground();
  }

  public static String getSearchAsString(HashMap<String, String> apiParams) {

    StringBuilder retval = new StringBuilder();
    if (apiParams != null && !apiParams.isEmpty()) {
      for (Map.Entry<String, String> entry : apiParams.entrySet()) {
        retval.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
      }
      return retval.toString().substring(0, retval.length() - 1);
    }
    return "";
  }

  @Override
  protected Long doInBackground(URL... urls) {
    Log.d("bishop", "omdbapiCoonnector says hello ");

    Request request = new Request.Builder()
        .url(host + "?apikey=" + apiKey + "&i=tt0109830")
        .get()
        .build();

    client.newCall(request).enqueue(new Callback() {
      @Override
      public void onFailure(Call call, IOException e) {
        e.printStackTrace();
      }

      @Override
      public void onResponse(Call call, Response response) throws IOException {
        try (ResponseBody responseBody = response.body()) {
          if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
          }

          Headers responseHeaders = response.headers();
          for (int i = 0, size = responseHeaders.size(); i < size; i++) {
            System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
          }

          System.out.println(responseBody.string());
        }
      }
    });

    return null;
  }

  @Override
  public String createRequest(HashMap<String, String> params) {
    return null;
  }

  @Override
  public List<Movie> parseResponse(List<String> strings) {
    return null;
  }

}
