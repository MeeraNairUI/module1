package com.circuitbreaker.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class CircuitBreaker {
	@Autowired
	RestTemplate template;
	
	
	@GetMapping("/test1")
	@io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker(name = "test1service", fallbackMethod = "fallback")
	
	public String test() {
		return this.template.getForObject("http://localhost:8080/testing", String.class); 
	}
}
