package com.nurtore.nurtorecurrency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class NurtorecurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NurtorecurrencyApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello name";
	}

}
