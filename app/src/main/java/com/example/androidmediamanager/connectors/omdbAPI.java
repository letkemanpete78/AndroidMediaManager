package com.example.androidmediamanager.connectors;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.example.androidmediamanager.Connector;
import com.example.androidmediamanager.models.Movie;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
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
  Context context = null;

  private String name;
  private String url;

  public omdbAPI() {
  }

  public omdbAPI(Context context) {
    this.context = context;
    doInBackground();
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
