package com.example.weather.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "weather_test")
public class Weather {

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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getMaxtempC() {
        return maxtempC;
    }

    public void setMaxtempC(int maxtempC) {
        this.maxtempC = maxtempC;
    }

    public int getWindspeedKmph() {
        return windspeedKmph;
    }

    public void setWindspeedKmph(int windspeedKmph) {
        this.windspeedKmph = windspeedKmph;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public int getTempC() {
        return tempC;
    }

    public void setTempC(int tempC) {
        this.tempC = tempC;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getMintempC() {
        return mintempC;
    }

    public void setMintempC(int mintempC) {
        this.mintempC = mintempC;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public int getHeatIndexC() {
        return heatIndexC;
    }

    public void setHeatIndexC(int heatIndexC) {
        this.heatIndexC = heatIndexC;
    }

    public int getWinddirDegree() {
        return winddirDegree;
    }

    public void setWinddirDegree(int winddirDegree) {
        this.winddirDegree = winddirDegree;
    }

    public double getSunHour() {
        return sunHour;
    }

    public void setSunHour(double sunHour) {
        this.sunHour = sunHour;
    }
}
