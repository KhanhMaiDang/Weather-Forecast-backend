package com.example.weather.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class DayForecasting {
    private String location;
    private String locationId;
    private LocalDate date;
    private int maxTempC;
    private int minTempC;
    private int chanceOfRain;

    public DayForecasting(String location, String locationId, LocalDate date, int maxTempC, int minTempC, int chanceOfRain) {
        this.location = location;
        this.locationId = locationId;
        this.date = date;
        this.maxTempC = maxTempC;
        this.minTempC = minTempC;
        this.chanceOfRain = chanceOfRain;
    }
}

