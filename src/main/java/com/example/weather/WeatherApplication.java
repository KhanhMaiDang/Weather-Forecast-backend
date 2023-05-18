package com.example.weather;

import com.example.weather.models.Location;
import com.example.weather.models.Weather;
import com.example.weather.models.WeatherForecasting;
import com.example.weather.repository.WeatherForecastingRepository;
import com.example.weather.services.externalServices.NominatimReverseGeocoding;
import com.example.weather.services.externalServices.implementation.NominatimReverseGeocodingImpl;
import com.example.weather.services.implementation.WeatherForecastingServiceImpl;
import com.example.weather.utils.StringUtils;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.TimeZone;

@OpenAPIDefinition
@SpringBootApplication
@Slf4j
public class WeatherApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		SpringApplication.run(WeatherApplication.class, args);
	}

}
