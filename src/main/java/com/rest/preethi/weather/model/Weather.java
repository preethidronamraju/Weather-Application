package com.rest.preethi.weather.model;

import org.springframework.data.annotation.Id;

public class Weather {
@Id private String id;
private String city;
private String description;
private int humidity;
private int pressure;
private int temperature;
private Wind wind;
private String timestamp;
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the humidity
 */
public int getHumidity() {
	return humidity;
}
/**
 * @param humidity the humidity to set
 */
public void setHumidity(int humidity) {
	this.humidity = humidity;
}
/**
 * @return the pressure
 */
public int getPressure() {
	return pressure;
}
/**
 * @param pressure the pressure to set
 */
public void setPressure(int pressure) {
	this.pressure = pressure;
}
/**
 * @return the temperature
 */
public int getTemperature() {
	return temperature;
}
/**
 * @param temperature the temperature to set
 */
public void setTemperature(int temperature) {
	this.temperature = temperature;
}
/**
 * @return the wind
 */
public Wind getWind() {
	return wind;
}
/**
 * @param wind the wind to set
 */
public void setWind(Wind wind) {
	this.wind = wind;
}
/**
 * @return the timestamp
 */
public String getTimestamp() {
	return timestamp;
}
/**
 * @param timestamp the timestamp to set
 */
public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}

}


//{
//	  "city": "Chicago",
//	  "description": "scattered clouds",
//	  "humidity": 33,
//	  "pressure": 1020,
//	  "temperature": 25,
//	  "wind": {
//	    "speed": 3.1,
//	    "degree": 240
//	  },
//	  "timestamp": "2017-02-14T05:48:41.861Z"
//	}