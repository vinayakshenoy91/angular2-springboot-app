package com.vinayak.learning.fullstackdeveloperangularspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.*")
public class FullStackDeveloperAngularSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullStackDeveloperAngularSpringbootApplication.class, args);
	}
}
