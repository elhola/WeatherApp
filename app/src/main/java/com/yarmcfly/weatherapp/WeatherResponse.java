package com.yarmcfly.weatherapp;

import com.google.gson.annotations.SerializedName;

public class WeatherResponse{

    @SerializedName("main")
    private Main main;

    public Main getMain() {
        return main;
    }
}