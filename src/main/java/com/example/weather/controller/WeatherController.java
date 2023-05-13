package com.example.weather.controller;

import com.example.weather.models.Location;
import com.example.weather.models.Weather;
import com.example.weather.services.WeatherService;
import com.example.weather.services.externalServices.NominatimReverseGeocoding;
import com.example.weather.services.externalServices.implementation.NominatimReverseGeocodingImpl;
import com.example.weather.utils.StringUtils;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weathers")
    public ResponseEntity<List<Weather>> getWeatherAtLocationInDateTimeRange(@RequestParam Double latitude,
                                                                             @RequestParam Double longitude,
                                                                             @RequestParam @Parameter(description = "Format: yyyy-mm-ddThh:mm:ss")
                                                                             LocalDateTime startDateTime, //yyyy-mm-ddThh:mm:ss
                                                                             @RequestParam @Parameter(description = "Format: yyyy-mm-ddThh:mm:ss")
                                                                             LocalDateTime endDateTime) {

        List<Weather> weatherList = weatherService.findWeatherByLatLongInDateTimeRange(latitude, longitude, startDateTime, endDateTime);
        return ResponseEntity.ok(weatherList);

    }

    @GetMapping("/weathers/location-name")
    public ResponseEntity<List<Weather>> getWeatherByLocationName(@RequestParam String locationName,
                                                                  @RequestParam @Parameter(description = "Format: yyyy-mm-ddThh:mm:ss")
                                                                          LocalDateTime startDateTime, //yyyy-mm-ddThh:mm:ss
                                                                  @RequestParam @Parameter(description = "Format: yyyy-mm-ddThh:mm:ss")
                                                                          LocalDateTime endDateTime){

        List<Weather> weatherList = weatherService.findWeatherByLocationInDateTimeRange(locationName, startDateTime, endDateTime);
        return ResponseEntity.ok(weatherList);
    }

}
