package com.example.weather.services;

import com.example.weather.models.WeatherForecasting;
import java.time.LocalDateTime;
import java.util.List;

public interface WeatherForecastingService {
    List<WeatherForecasting> getHourlyWeatherForecast(String locationName, LocalDateTime startDateTime);
}
