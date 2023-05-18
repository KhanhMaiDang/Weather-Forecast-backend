package com.example.weather.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter @Setter
@Document(collection = "weather")
public class Weather {
    private String _id;

    @Field(name = "date_time")
    private LocalDateTime dateTime;

//    @Field(name = "location_id")
//    private String locationId;

    private String location;

    @Field(name = "truth_location")
    private String truthLocation;

    @Field(name = "weather_status")
    private String weatherStatus;

    private int tempC;

    @Field("FeelsLikeC")
    private int feelsLikeC;

    @Field(name = "HeatIndexC")
    private int heatIndexC;

    @Field(name = "maxtempC")
    private int maxTempC;

    @Field(name = "mintempC")
    private int minTempC;
  
    @Field(name = "DewPointC")
    private int dewPointC;

    @Field(name = "WindChillC")
    private int windChillC;

    @Field(name = "windspeedKmph")
    private int windSpeedKmph;

    @Field(name = "WindGustKmph")
    private int windGustKmph;

    @Field(name = "winddirDegree")
    private int windDirDegree;

    private int humidity;

    private int pressure;

    @Field(name = "totalSnow_cm")
    private double totalSnowCm;

    @Field(name = "precipMM")
    private double precipitationMm;

    private int visibility;

    @Field(name = "cloudcover")
    private int cloudCover;

    private int uvIndex;
    private double sunHour;

    private String sunrise;

    private String sunset;

    private String moonrise;

    private String moonset;

    @Field(name = "moon_illumination")
    private int moonIllumination;
}
