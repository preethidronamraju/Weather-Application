package com.rest.preethi.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.preethi.weather.dao.WeatherDAO;
import com.rest.preethi.weather.model.Weather;

@Service
public class WeatherService {

    @Autowired
    private WeatherDAO weatherDAO;

    public Weather updateWeather(Weather weather){
        return weatherDAO.save(weather);
    }


   
}
