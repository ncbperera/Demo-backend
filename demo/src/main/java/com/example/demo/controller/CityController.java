package com.example.demo.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.City;
import com.example.demo.service.CityService;

@Component
@Path ("/city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/")
	public String hello() {
		return "hellooo ";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("cityList")
	public List<City> getCityList() {
		List<City> list = cityService.getAllCities();
		return list;
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/updateCity")
	public void updateCity(@RequestBody City city) {
		System.out.println("City :::: "+city.getId());
		cityService.updateCity(city);
	}
	
}
