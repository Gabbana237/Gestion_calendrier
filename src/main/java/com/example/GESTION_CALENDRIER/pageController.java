package com.example.GESTION_CALENDRIER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
    @GetMapping(path = "api")
	public String hello() {
		return "HH";
	}
	
}
