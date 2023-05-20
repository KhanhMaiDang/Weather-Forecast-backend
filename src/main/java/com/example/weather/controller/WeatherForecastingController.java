package com.example.weather.controller;

import com.example.weather.models.DayForecasting;
import com.example.weather.models.WeatherForecasting;
import com.example.weather.services.WeatherForecastingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/weather/forecast")
@CrossOrigin(origins = "*")
public class WeatherForecastingController {
    private final WeatherForecastingService forecastingService;

    public WeatherForecastingController(WeatherForecastingService forecastingService) {
        this.forecastingService = forecastingService;
    }

    @GetMapping("/hourly")
    public ResponseEntity<List<WeatherForecasting>> getHourlyWeatherForecast(@RequestParam String locationName, @RequestParam LocalDateTime currentDateTime){
        List<WeatherForecasting> forecastingList = forecastingService.getHourlyWeatherForecast(locationName, currentDateTime);

        return ResponseEntity.ok(forecastingList);
    }

    @GetMapping("/weekly")
    public ResponseEntity<List<DayForecasting>> getWeeklyWeatherForecast(@RequestParam String locationName, @RequestParam LocalDateTime currentDateTime){
        List<DayForecasting> weeklyForecastingList = forecastingService.getWeeklyWeatherForecast(locationName, currentDateTime);

        return ResponseEntity.ok(weeklyForecastingList);
    }
}
