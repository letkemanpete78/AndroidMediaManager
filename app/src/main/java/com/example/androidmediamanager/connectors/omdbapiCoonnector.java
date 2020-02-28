package com.example.androidmediamanager.connectors;

import com.example.androidmediamanager.Connector;
import com.example.androidmediamanager.models.Movie;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

public class omdbapiCoonnector implements Connector {

  String name;
  String url;

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
  public String createRequest(HashMap<String, String> params) {
    return null;
  }

  @Override
  public List<Movie> parseResponse(List<String> strings) {
    return null;
  }

  public String apitest() {
//    http://www.omdbapi.com/?i=tt3896198&apikey=1273ff27
//    final String apiKey = "174b9ed7bfmshe2cce36688f2258p1deac9jsn3dd98188fdb3";
//    final String host = "imdb8.p.rapidapi.com";
    final String apiKey = "1273ff27";
    final String host = "http://www.omdbapi.com";

    OkHttpClient client = new OkHttpClient();

    Request request = new Request.Builder()
        .url(host + "?i=tt389619&apikey=" + apiKey)
        .get()
        .build();

    final Response response = null;

    client.newCall(request).enqueue(new Callback() {
      @Override
      public void onFailure(@NotNull Call call, @NotNull IOException e) {
        e.printStackTrace();
      }

      @Override
      public void onResponse(@NotNull Call call, @NotNull final Response response)
          throws IOException {
        if (!response.isSuccessful()) {
          throw new IOException("Unexpected code " + response);
        } else {
          // do something wih the result
        }
      }
    });
    return String.valueOf(response);
  }

  private class DownloadData implements Runnable {

    @Override
    public void run() {

    }
  }
}
