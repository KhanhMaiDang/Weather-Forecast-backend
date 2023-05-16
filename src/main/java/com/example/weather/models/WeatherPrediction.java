package com.example.weather.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Getter
@Setter
@Document(collection = "weather_prediction")
public class WeatherPrediction {
    @Field(name = "_id")
    private String id;
    private String location;
    @Field(name = "location_id")
    private String locationId;
    @Field(name = "date_time")
    private LocalDateTime dateTime;
    private int tempC;
    @Field(name = "raining")
    private boolean isRaining;
}
