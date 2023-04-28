package com.example.weather.services.externalServices.implementation;

import com.example.weather.models.Location;
import com.example.weather.services.externalServices.NominatimReverseGeocoding;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class NominatimReverseGeocodingImpl implements NominatimReverseGeocoding {

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public Location reverseGeocoding(Double latitude, Double longitude) {

        String url = "https://nominatim.openstreetmap.org/reverse?format=jsonv2&lat=" + latitude + "&lon=" + longitude;

        ResponseEntity<String> response = restTemplate.getForEntity(url,String.class);
        JSONObject jsonObject = new JSONObject(response.getBody());
        JSONObject address = jsonObject.getJSONObject("address");

        String province = address.optString("state"); // optString: Returns the value mapped by name if it exists, returns the empty string if no such mapping exists.
                                                            // If the value is not a string and is not null, then it is converted to a string
        String city = address.optString("city");
        String district = address.optString("city_district"); // city_district || county
        String ward = address.optString("suburb");

        Location location = new Location(province,city,district,ward);

        return location;
    }
}
