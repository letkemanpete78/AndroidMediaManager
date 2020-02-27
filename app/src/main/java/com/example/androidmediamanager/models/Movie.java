package com.example.androidmediamanager.models;

import com.example.androidmediamanager.Search;
import java.time.LocalDate;
import java.util.List;
import okhttp3.OkHttpClient;
import org.json.JSONObject;

final class Movie extends Media implements Search {

  private OkHttpClient client = new OkHttpClient();

  Movie() {
  }

  Movie(String description, String titleName, List<Float> ratings,
      List<Review> reviews, String providerLink, String source,
      List<Image> images, String runtime, Subtitle subtitle,
      List<String> languages, List<Person> actors,
      List<Person> directors, List<Genre> genres, LocalDate releaseDate,
      String id) {
    super(description, titleName, ratings, reviews, providerLink, source, images, runtime, subtitle,
        languages, actors, directors, genres, releaseDate, id);
  }

  @Override
  public List<JSONObject> getResultsById(String id, String searchParms,
      String header, String body, String url) {
    return null;
  }

  @Override
  public List<JSONObject> getResultsByTitle(String title, String searchParms,
      String header, String body, String url) {
    return null;
  }

/*
  OkHttpClient client = new OkHttpClient();

Request request = new Request.Builder()
	.url("https://movie-database-imdb-alternative.p.rapidapi.com/?page=1&r=json&s=Avengers%20Endgame")
	.get()
	.addHeader("x-rapidapi-host", "movie-database-imdb-alternative.p.rapidapi.com")
	.addHeader("x-rapidapi-key", "174b9ed7bfmshe2cce36688f2258p1deac9jsn3dd98188fdb3")
	.build();

Response response = client.newCall(request).execute();
   */
}
