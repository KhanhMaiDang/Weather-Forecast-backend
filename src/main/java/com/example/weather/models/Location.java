package com.example.weather.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Location {
    private String province;
    private String city;
    private String district;
    private String ward;

}
