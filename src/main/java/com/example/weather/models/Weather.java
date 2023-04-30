package com.example.weather.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Getter @Setter
@Document(collection = "weather_test")
public class  Weather {
    private String _id;
    private LocalDateTime dateTime;
    private double precipMM;
    private int windGustKmph;
    private int dewPointC;
    private int pressure;
    private int maxtempC;
    private int cloudcover;
    private double totalSnowCm;
    private int windspeedKmph;
    private String location;
    private String locationId;
    private int moonIllumination;
    private int tempC;
    private int humidity;
    private int uvIndex;
    private int feelsLikeC;
    private int mintempC;
    private String moonset;
    private String sunset;
    private int visibility;
    private int heatIndexC;
    private String sunrise;
    private int winddirDegree;
    private double sunHour;
}
