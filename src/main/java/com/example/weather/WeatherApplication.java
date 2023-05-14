package com.example.weather;

import com.example.weather.models.Location;
import com.example.weather.models.Weather;
import com.example.weather.services.externalServices.NominatimReverseGeocoding;
import com.example.weather.services.externalServices.implementation.NominatimReverseGeocodingImpl;
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

//		String s = "Hải Phòng";
//		String s2 = "Hồ Chí Minh";
//		String s3 = "Hải Dương";
//		String res = StringUtils.removeAccent(s);
//		String res2 = StringUtils.removeAccent(s2);
//		String res3 = StringUtils.removeAccent(s3);
//		System.out.println(res);
//		System.out.println(res2);
//		System.out.println(res3);
	}

}
