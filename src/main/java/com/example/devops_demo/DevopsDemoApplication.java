package com.example.devops_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication(exclude = {
	    org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration.class,
	    org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration.class
	})
public class DevopsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsDemoApplication.class, args);
	}

}
