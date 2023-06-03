package com.example.circuitbreaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
@EnableCircuitBreaker
@SpringBootApplication
public class CircuitbreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}

}
