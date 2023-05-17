package com.example.weather.services.implementation;

import com.example.weather.models.WeatherForecasting;
import com.example.weather.repository.WeatherForecastingRepository;
import com.example.weather.services.WeatherForecastingService;
import com.example.weather.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeatherForecastingServiceImpl implements WeatherForecastingService {

    private final WeatherForecastingRepository weatherForecastingRepository;

    public WeatherForecastingServiceImpl(WeatherForecastingRepository weatherForecastingRepository) {
        this.weatherForecastingRepository = weatherForecastingRepository;
    }

    @Override
    public List<WeatherForecasting> getHourlyWeatherForecast(String locationName, LocalDateTime startDateTime) {
        LocalDateTime endDaTeTime = startDateTime.plusDays(1);
        locationName = StringUtils.removeAccent(locationName);

        List<WeatherForecasting> forecastingList = weatherForecastingRepository.findWeatherForecastingByLocationAndDateTimeBetween(locationName, startDateTime, endDaTeTime);

        return forecastingList;
    }
}
