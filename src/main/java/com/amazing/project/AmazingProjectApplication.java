package com.amazing.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AmazingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazingProjectApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(AmazingProjectApplication.class); // Override this method
//	}
}
