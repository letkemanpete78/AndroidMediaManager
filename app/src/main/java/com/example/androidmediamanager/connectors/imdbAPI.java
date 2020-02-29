package com.example.androidmediamanager.connectors;

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
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

public class imdbAPI extends AsyncTask<URL, Integer, Long> implements Connector {

  final OkHttpClient client = new OkHttpClient();
  final String host = "https://imdb-internet-movie-database-unofficial.p.rapidapi.com/search/inception";
  final String apiKey = "1273ff27";
  final String searchWord = "inception";
  String name;
  String url;
  Request request = new Builder()
      .url(host + "/search/" + searchWord)
      .get()
      .addHeader("x-rapidapi-host", "imdb-internet-movie-database-unofficial.p.rapidapi.com")
      .addHeader("x-rapidapi-key", "98587a65d2mshd7841432f9a10fep182e8cjsn982a4e2d22e5")
      .build();

  public imdbAPI() {
    doInBackground();
  }


  @Override
  protected Long doInBackground(URL... urls) {
    Log.d("bishop", "imdbapi says hello ");

    Request request = new Request.Builder()
        .url(host + "?i=tt0109830&apikey=" + apiKey)
        .get()
        .build();

    client.newCall(request).enqueue(new Callback() {
      @Override
      public void onFailure(@NotNull Call call, @NotNull IOException e) {
        e.printStackTrace();
      }

      @Override
      public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
        try (ResponseBody responseBody = response.body()) {
          if (!response.isSuccessful()) {
            throw new IOException("Unexpected code " + response);
          }

          Headers responseHeaders = response.headers();
          for (int i = 0, size = responseHeaders.size(); i < size; i++) {
            System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
          }

          if (responseBody != null) {
            System.out.println(responseBody.string());
          } else {
            System.out.println("Body is empty");
          }
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
