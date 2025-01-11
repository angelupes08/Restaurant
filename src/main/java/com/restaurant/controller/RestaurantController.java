package com.restaurant.controller;

import com.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("")
    public String getResponse(){

        return "Restaurant is opened"+restaurantService.restaurantService();
    }

    @GetMapping("/name")
    public String getName(){

        return "Taj Palace";
    }
}
