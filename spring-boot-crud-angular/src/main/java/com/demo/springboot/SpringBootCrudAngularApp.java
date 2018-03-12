package com.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.demo.springboot.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.demo.springboot"})
public class SpringBootCrudAngularApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudAngularApp.class, args);

	}
}
