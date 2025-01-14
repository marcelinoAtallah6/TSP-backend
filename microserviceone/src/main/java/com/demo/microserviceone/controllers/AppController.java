package com.demo.microserviceone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class AppController {
	
	@GetMapping("/get")
	public String home() {
		System.out.println(" in >>>>>>>>>");
		return "<h2>Microservice one is running</h2>";
	}

}
