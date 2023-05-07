package com.example.weather.repository;

import com.example.weather.models.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Repository
public interface WeatherRepository extends MongoRepository<Weather, String> {
    public List<Weather> findAllByLocation(String location);

    @Query("{ 'location': ?0, 'date_time': { $gte: ?1, $lte: ?2 } }")
    public List<Weather> findWeatherByLocationAndDateTimeBetween(String location, LocalDateTime startDate, LocalDateTime endDate);

}
