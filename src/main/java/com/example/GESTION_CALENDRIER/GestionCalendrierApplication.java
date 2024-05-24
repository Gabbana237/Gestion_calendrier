package com.example.GESTION_CALENDRIER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GestionCalendrierApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionCalendrierApplication.class, args);
	}

}
