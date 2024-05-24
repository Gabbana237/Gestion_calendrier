package com.example.GESTION_CALENDRIER.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.GESTION_CALENDRIER.services.RappelService;

@RestController
public class RappelController {
    
    @Autowired
    private RappelService rappelService;

    @GetMapping("/rappel/send")
    public String sendRappel(){
        rappelService.sendEventRappels();
        return "Rappel envoyé";
    }

}
