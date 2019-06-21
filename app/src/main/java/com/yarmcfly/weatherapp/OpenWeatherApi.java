package com.yarmcfly.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OpenWeatherApi {

    String API_KEY = "63abce1cafa188f25881cb91777cc5ba";

    @GET("/data/2.5/weather")
    Call<WeatherResponse> getCurrentWeather(
            @Query("q") String cityAndCountryCode,
            @Query("APPID") String apiKey
    );
}