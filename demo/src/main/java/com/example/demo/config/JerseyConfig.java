package com.example.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.demo.controller.AuthenticationController;
import com.example.demo.controller.CityController;

@Component 
@javax.ws.rs.ApplicationPath ("api/v1")
public class JerseyConfig extends ResourceConfig 
{
	public JerseyConfig() {
		register(CityController.class);
		register(AuthenticationController.class);
	}
}