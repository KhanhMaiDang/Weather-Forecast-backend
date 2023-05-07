package com.example.weather.controller;

import com.example.weather.models.Weather;
import com.example.weather.services.WeatherService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<List<Weather>> getWeatherAtLocationInDateTimeRange(@RequestParam String location,
                                                               @RequestParam @Parameter(description = "Format: yyyy-mm-ddThh:mm:ss")
                                                                       LocalDateTime startDateTime, //yyyy-mm-ddThh:mm:ss
                                                               @RequestParam @Parameter(description = "Format: yyyy-mm-ddThh:mm:ss")
                                                                                         LocalDateTime endDateTime){

        List<Weather> weatherList = weatherService.findWeatherByLocationInDateTimeRange(location,startDateTime,endDateTime);
        return ResponseEntity.ok(weatherList);

    }

}
