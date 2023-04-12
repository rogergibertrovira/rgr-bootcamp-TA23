package com.rgibert.basicgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicgradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicgradleApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome() {
		return String.format("Welcome to Gradle!");
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
