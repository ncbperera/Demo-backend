package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;

@Service
@Transactional
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getAllCities(){
		return cityRepository.findAll();
	}
	
	public City getCity(Long id) {
		return cityRepository.findById(id).get();
	}
	
	public void updateCity(City cityDTO) {
		City city = cityRepository.findById(cityDTO.getId()).get();
		
		city.setName(cityDTO.getName());
		city.setImg_path(cityDTO.getImg_path());
		cityRepository.save(city);
	}
	
}
