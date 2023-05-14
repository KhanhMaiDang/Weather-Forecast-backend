package com.example.weather.configurations;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class MongoConfig {

    /**
     * Create a MongoTemplate bean to connect to the MongoDB server.
     * Use the default MongoDB address and port to create a MongoClient.
     * Create a MongoTemplate with the MongoClient and the database name "weatherDB".
     * @return MongoTemplate for querying MongoDB database
     */

    @Bean
    public static MongoTemplate mongoTemplate(){
        //mongoDB Atlas
        MongoClient mongoClient = MongoClients.create("mongodb+srv://grab:admin4321@cluster0.nqxzihj.mongodb.net/?retryWrites=true&w=majority");
        //MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017"); mongoDB local
        MongoTemplate mongoTemplate = new MongoTemplate(mongoClient, "weatherDB");
        return mongoTemplate;
    }
}

