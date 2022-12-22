package com.example.demo.service;

import java.util.List;

import com.example.demo.model.City;

public interface CityService {

	List<City> getAllCities();
	
	void updateCity(City city);
}
