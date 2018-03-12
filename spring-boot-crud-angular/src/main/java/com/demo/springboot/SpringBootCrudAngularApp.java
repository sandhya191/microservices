package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.demo.springboot"})
public class SpringBootCrudAngularApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudAngularApp.class, args);

	}
}
