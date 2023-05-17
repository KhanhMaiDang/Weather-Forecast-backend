package com.example.weather.repository;

import com.example.weather.models.WeatherForecasting;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface WeatherForecastingRepository extends MongoRepository<WeatherForecasting, String> {
    //@Query("{'location': ?0, 'date_time': {$gte: ?1, $lte: ?2} }")
    public List<WeatherForecasting> findWeatherForecastingByLocationAndDateTimeBetween(String locationName, LocalDateTime startDateTime, LocalDateTime endDateTime);
}
