package com.example.weather.controller;

import com.example.weather.configurations.MongoConfig;
import com.example.weather.models.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DatabaseController {


    @Autowired
    MongoTemplate mongoTemplate = MongoConfig.mongoTemplate();

    //Return all Weather objects from the database.
    public List<Weather> findAll() {
        return mongoTemplate.findAll(Weather.class);
    }


}



