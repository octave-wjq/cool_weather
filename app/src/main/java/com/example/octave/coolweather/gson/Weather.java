package com.example.octave.coolweather.gson;

import android.view.textservice.SuggestionsInfo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastsList;
}
