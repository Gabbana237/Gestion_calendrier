package com.example.GESTION_CALENDRIER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class GestionCalendrierApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionCalendrierApplication.class, args);
	}

	@GetMapping(path = "a")
	public String hello() {
		return "pages/home";
	}
	
    
}
