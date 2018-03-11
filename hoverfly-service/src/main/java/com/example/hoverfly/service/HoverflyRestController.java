package com.example.hoverfly.service;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sandhya
 *
 */

@RestController
public class HoverflyRestController {
	
	@RequestMapping(value = "/service/hoverfly")
	public HoverflyServiceResponse getSampleResponse() {
		
		System.out.println("Inside HoverflyServiceApplication::getSampleResponse()");
		return new HoverflyServiceResponse("returned value from HoverflyServiceApplication", new Date().toString(), UUID.randomUUID().toString());
	}
}
