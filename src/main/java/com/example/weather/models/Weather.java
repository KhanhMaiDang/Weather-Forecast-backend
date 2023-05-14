package com.example.weather.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter @Setter
@Document(collection = "weather")
//@Document(collection = "weather_test") // mongoDB local
public class  Weather {
    private String _id;

    @Field(name = "date_time")
    private LocalDateTime dateTime;

    @Field(name = "precipMM")
    private double precipitationMM;

    @Field(name = "WindGustKmph")
    private int windGustKmph;
    @Field(name = "DewPointC")
    private int dewPointC;
    private int pressure;
    @Field(name = "maxtempC")
    private int maxTempC;
    @Field(name = "cloudcover")
    private int cloudCover;
    @Field(name = "totalSnow_cm")
    private double totalSnowCm;
    @Field(name = "windspeedKmph")
    private int windSpeedKmph;
    private String location;

    @Field(name="location_id")
    private String locationId;
    @Field(name = "truth_location")
    private String truthLocation;
    @Field(name = "moon_illumination")
    private int moonIllumination;
    private int tempC;
    private int humidity;
    private int uvIndex;
    @Field("FeelsLikeC")
    private int feelsLikeC;
    @Field(name = "mintempC")
    private int minTempC;
    private String moonset;
    private String sunset;
    private int visibility;
    @Field(name = "HeatIndexC")
    private int heatIndexC;
    private String sunrise;
    @Field(name="winddirDegree")
    private int windDirDegree;
    private double sunHour;
    @Field(name = "weather_status")
    private String weatherStatus;
    @Field(name = "avgtempC")
    private double avgTempC;
}
