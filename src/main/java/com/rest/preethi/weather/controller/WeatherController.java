package com.rest.preethi.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rest.preethi.weather.model.Weather;
import com.rest.preethi.weather.service.WeatherService;

import java.util.List;

@RestController
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;


    @RequestMapping(value = "/weather/updateWeather", method = RequestMethod.POST)
    public Weather updateWeather(@RequestBody Weather weather){
	        return weatherService.updateWeather(weather);
    }
    @RequestMapping(value = "/weather/listOfCities", method = RequestMethod.GET)
    public List<String> listOfCities(){
        return weatherService.listOfCities();
    }
    @RequestMapping(value = "/weather/latestCityWeather", method = RequestMethod.GET)
    public Weather getLatestCityWeather(@RequestParam(required=true) String city){
        return weatherService.getLatestCityWeather(city);
    }

    @RequestMapping(value = "/weather/givenCityWeatherInfo/{city}", method = RequestMethod.GET)
    public String getGivenCityWeatherInfo(@RequestParam(required=true) String property, @PathVariable String city){

        Weather weather = weatherService.getLatestCityWeather(city);
        if(property.equalsIgnoreCase("humidity")){
            return weather.getHumidity()+"";
        }
        else if(property.equalsIgnoreCase("pressure")){
            return weather.getPressure()+"";
        }
        else if(property.equalsIgnoreCase("temperature")){
            return weather.getTemperature()+"";
        }
        else if(property.contains("speed")){
            return weather.getWind().getSpeed()+"";
        }
        else if(property.contains("degree")){
            return weather.getWind().getSpeed()+"";
        }
        return "not found";
    }

    @RequestMapping(value = "/weather/hourlyAvgWeather", method = RequestMethod.GET)
    public List<Weather> getHourlyAvgWeather(@RequestParam(required=true) String city){
        return weatherService.getDailyAverageWeather(city);
    }

    @RequestMapping(value = "/weather/dailyAvgWeather", method = RequestMethod.GET)
    public List<Weather>  getDailyAvgWeather(@RequestParam(required=true) String city){
        return weatherService.getDailyAverageWeather(city);
    }

    @RequestMapping(value = "/checkServer", method = RequestMethod.GET)
    public String sample(){
        return "Welcome to Chicago Weather Updates"
        		+ "";
    }


}
