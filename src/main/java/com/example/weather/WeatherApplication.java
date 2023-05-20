package com.example.weather;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
