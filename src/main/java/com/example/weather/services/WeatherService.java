package com.example.weather.services;

import com.example.weather.models.Weather;


import java.time.LocalDateTime;
import java.util.List;

public interface WeatherService {
    List<Weather> findWeatherByLocation(String location);
    List<Weather> findWeatherByLocationInDateTimeRange(String location, LocalDateTime startDate, LocalDateTime endDate);
    List<Weather> findWeatherByLatLongInDateTimeRange(double latitude, double longitude, LocalDateTime startDate, LocalDateTime endDate);

}
