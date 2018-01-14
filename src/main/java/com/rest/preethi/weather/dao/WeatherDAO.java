package com.rest.preethi.weather.dao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rest.preethi.weather.model.Weather;


@Repository
public interface WeatherDAO extends MongoRepository<Weather, String> {

}