package com.simplilearn.hooli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HooliApplication {

	public static void main(String[] args) {
		SpringApplication.run(HooliHomeController.class, args);
	}

}
