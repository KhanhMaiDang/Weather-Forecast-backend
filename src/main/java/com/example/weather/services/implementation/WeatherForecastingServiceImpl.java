package com.example.weather.services.implementation;

import com.example.weather.models.DayForecasting;
import com.example.weather.models.WeatherForecasting;
import com.example.weather.repository.WeatherForecastingRepository;
import com.example.weather.services.WeatherForecastingService;
import com.example.weather.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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

    @Override
    public List<DayForecasting> getWeeklyWeatherForecast(String locationName, LocalDateTime startDateTime) {
        List<DayForecasting> weeklyForecastingList = new ArrayList<>();

        for (int day = 0; day < 7; day++) {
            LocalDateTime currentDateTime = startDateTime.plusDays(day);
            List<WeatherForecasting> hourlyWeatherForecast = getHourlyWeatherForecast(locationName, currentDateTime);

            String location = hourlyWeatherForecast.get(0).getLocation();
            String locationId = hourlyWeatherForecast.get(0).getLocationId();
            LocalDate date = hourlyWeatherForecast.get(0).getDateTime().toLocalDate();

            int maxTempC = Integer.MIN_VALUE;
            int minTempC = Integer.MAX_VALUE;
            int totalIsRaining = 0;
            int numHours = hourlyWeatherForecast.size();

            for (WeatherForecasting weatherForecast : hourlyWeatherForecast) {
                maxTempC = Math.max(maxTempC, weatherForecast.getTempC());
                minTempC = Math.min(minTempC, weatherForecast.getTempC());
                totalIsRaining += weatherForecast.getIsRaining();
            }

            int chanceOfRain = (totalIsRaining * 100) / numHours;
            DayForecasting dayForecast = new DayForecasting(location, locationId, date, maxTempC, minTempC, chanceOfRain);
            weeklyForecastingList.add(dayForecast);
        }

        return weeklyForecastingList;
    }

}
