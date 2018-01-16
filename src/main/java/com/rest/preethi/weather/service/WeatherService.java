package com.rest.preethi.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.stereotype.Service;

import com.rest.preethi.weather.dao.WeatherDAO;
import com.rest.preethi.weather.model.Weather;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class WeatherService {

    @Autowired
    private WeatherDAO weatherDAO;

    public Weather updateWeather(Weather weather){
        return weatherDAO.save(weather);
    }

    public List<String> listOfCities(){

        List<Weather> allList = weatherDAO.findAll();
        List<String> cities = new ArrayList<String>();
        for (Weather weather: allList) {
            if(!cities.contains(weather.getCity())){
                cities.add(weather.getCity());
            }
        }
        return cities;
    }

    public Weather getLatestCityWeather(String city){
        List<Weather> allList = weatherDAO.findAll();
        List<Weather> allCities = allList.stream().filter(p -> p.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        allCities.sort(Comparator.comparing(Weather::getTimestamp));
        Weather result = new Weather();
        if(allCities.size() > 0)
            result = allCities.get(0);
        return result;
    }

    public List<Weather> getDailyAverageWeather(String city){
        List<Weather> allList = weatherDAO.findAll();
        List<Weather> allCities = allList.stream().filter(p -> p.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
        allCities.sort(Comparator.comparing(Weather::getTimestamp));
        return allCities;
    }
}
