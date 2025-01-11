package com.restaurant.service;

import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    public String restaurantService(){

        return "Welcome to our restaurant";
    }

    public String getName(){

        return "Tulip Inn";
    }
}
