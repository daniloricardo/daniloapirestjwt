package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	DatabaseService databaseService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);


	}




	@PostConstruct
	public void init(){
		databaseService.create();
	}
}
