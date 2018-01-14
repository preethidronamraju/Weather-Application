package com.rest.preethi.weather.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {


    @RequestMapping(value = "/weather/listOfCities", method = RequestMethod.GET)
    public ResponseEntity<?> listOfCities(){
        return ResponseEntity.status(200).build();
    }
    @RequestMapping(value = "/weather/givenCityWeather", method = RequestMethod.GET)
    public ResponseEntity<?> getGivenCityWeather(){
        return ResponseEntity.status(200).build();
    }

    @RequestMapping(value = "/weather/givenCityWeatherInfo", method = RequestMethod.GET)
    public ResponseEntity<?> getGivenCityWeatherInfo(){
        return ResponseEntity.status(200).build();
    }

    @RequestMapping(value = "/weather/hourlyAvgWeather", method = RequestMethod.GET)
    public ResponseEntity<?> getHourlyAvgWeather(){
        return ResponseEntity.status(200).build();
    }

    @RequestMapping(value = "/weather/dailyAvgWeather", method = RequestMethod.GET)
    public ResponseEntity<?> getDailyAvgWeather(){
        return ResponseEntity.status(200).build();
    }

    @RequestMapping(value = "/checkServer", method = RequestMethod.GET)
    public String sample(){
        return "Welcome to Chicago Weather Updates"
        		+ "";
    }


}
