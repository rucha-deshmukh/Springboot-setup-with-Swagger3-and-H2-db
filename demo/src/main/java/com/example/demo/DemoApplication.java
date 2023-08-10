package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@OpenAPIDefinition(
	info=@Info(
			title = "Basic Springboot Setup Project",
			version = "1.0.0",
			description = "SPringboot application with Swagger3 and H2 db integrated",
			contact = @Contact(
					email = "rdruch361@gmail.com",
					name = "Rucha Deshmukh"
			),
			license = @License(
					name="license",
					url="ruchadeshmukh"
			)
	)
		)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		log.info("Application started");
	}


}
