package com.example.weather.services.implementation;

import com.example.weather.models.Location;
import com.example.weather.models.Weather;
import com.example.weather.repository.WeatherRepository;
import com.example.weather.services.WeatherService;
import com.example.weather.services.externalServices.NominatimReverseGeocoding;
import com.example.weather.services.externalServices.implementation.NominatimReverseGeocodingImpl;
import com.example.weather.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {
    private final WeatherRepository weatherRepository;

    public WeatherServiceImpl(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    @Override
    public List<Weather> findWeatherByLocation(String location) {
        return weatherRepository.findAllByLocation(location);
    }

    @Override
    public List<Weather> findWeatherByLocationInDateTimeRange(String location, LocalDateTime startDate, LocalDateTime endDate) {
        return weatherRepository.findWeatherByLocationAndDateTimeBetween(location,startDate, endDate);
    }

    @Override
    public List<Weather> findWeatherByLatLongInDateTimeRange(double latitude, double longitude, LocalDateTime startDate, LocalDateTime endDate ) {
        NominatimReverseGeocoding nominatimReverseGeocoding = new NominatimReverseGeocodingImpl();

        Location location = nominatimReverseGeocoding.reverseGeocoding(latitude,longitude);
        String locationName = location.getProvince() != "" ? location.getProvince() : location.getCity();
        locationName = StringUtils.removeAccent(locationName);

        if (locationName.startsWith("Tinh")){
            locationName = locationName.substring(5);
        }
        else{
            if (locationName.startsWith("Thanh pho")){
                locationName = locationName.substring(10);

            }
        }
        return weatherRepository.findWeatherByLocationAndDateTimeBetween(locationName, startDate, endDate);
    }

}
