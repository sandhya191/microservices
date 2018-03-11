package com.example.hoverfly.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Sandhya
 * Demonstrate Microservices virtualization. 
 * This is Application publishes a Rest Service that will be consumed by a proxy client.
 * Simulated Vs Actual Responses will be monitored in the Hoverfly UI.
 *
 */

@SpringBootApplication
public class HoverflyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoverflyServiceApplication.class, args);
	}
}