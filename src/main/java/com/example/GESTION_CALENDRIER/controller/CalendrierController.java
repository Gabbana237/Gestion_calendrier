package com.example.GESTION_CALENDRIER.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.GESTION_CALENDRIER.model.Calendrier;
import com.example.GESTION_CALENDRIER.repository.CalendrierRepository;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@RestController
public class CalendrierController {

    @Autowired
    private CalendrierRepository calendrierRepository;

    @PostMapping("/calendrier")
        Calendrier newCalendrier(@RequestBody Calendrier newCalendrier){
        return calendrierRepository.save(newCalendrier);
    }

    @GetMapping("/calendriers")
    List<Calendrier> getAllUsers(){
        return calendrierRepository.findAll();
    }
   
    
}
