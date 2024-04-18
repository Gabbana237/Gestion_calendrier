package com.example.GESTION_CALENDRIER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hellocontroller {
    
    @GetMapping("ap")
	public String hello() {
		return "pages/home";
	}
    

}
