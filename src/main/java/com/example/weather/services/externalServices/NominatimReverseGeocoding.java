package com.example.weather.services.externalServices;

import com.example.weather.models.Location;

public interface NominatimReverseGeocoding {
    Location reverseGeocoding(Double latitude, Double longitude);
}
