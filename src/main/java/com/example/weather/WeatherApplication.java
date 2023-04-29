package com.example.weather;

import com.example.weather.controller.DatabaseController;
import com.example.weather.models.Location;
import com.example.weather.models.Weather;
import com.example.weather.services.externalServices.NominatimReverseGeocoding;
import com.example.weather.services.externalServices.implementation.NominatimReverseGeocodingImpl;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@OpenAPIDefinition
@SpringBootApplication
@Slf4j
public class WeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherApplication.class, args);

//		NominatimReverseGeocoding nominatimReverseGeocoding = new NominatimReverseGeocodingImpl();
//
//		Location res1 = nominatimReverseGeocoding.reverseGeocoding(10.980024, 106.820927);
//		Location res2 = nominatimReverseGeocoding.reverseGeocoding(10.805883, 106.680309);
//		Location res3 = nominatimReverseGeocoding.reverseGeocoding(21.019182, 105.858082);
//		Location res4 = nominatimReverseGeocoding.reverseGeocoding(11.001922, 107.869311);
//
//		log.info("Location 1 is {}", res1);
//		log.info("Location 2 is {}", res2);
//		log.info("Location 3 is {}", res3);
//		log.info("Location 4 is {}", res4);

//		DatabaseController databaseController = new DatabaseController();
//		List<Weather> list = databaseController.findAll();
//		System.out.println(list.size());
	}

}
