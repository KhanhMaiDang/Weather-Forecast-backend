package com.example.weather.services;

import com.example.weather.models.Weather;


import java.time.LocalDateTime;
import java.util.List;

public interface WeatherService {
    public List<Weather> findWeatherByLocation(String location);
    public List<Weather> findWeatherByLocationInDateTimeRange(String location, LocalDateTime startDate, LocalDateTime endDate);
    public List<Weather> findWeatherByLatLongInDateTimeRange(double latitude, double longitude, LocalDateTime startDate, LocalDateTime endDate);

}
