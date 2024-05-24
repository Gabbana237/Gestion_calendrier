package com.example.GESTION_CALENDRIER.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.GESTION_CALENDRIER.model.Evenement;
import com.example.GESTION_CALENDRIER.repository.EvenementRepository;

public class EvenementService {

    @Autowired
    private static EvenementRepository eventRepository;

    public static List<Evenement> getAllEvents() {
        return eventRepository.findAll();
    }
    
    public Optional<Evenement> getEventById(Long id) {
        return eventRepository.findById(id);
    }

    public Evenement saveEvent(Evenement event) {
        return eventRepository.save(event);
    }

    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }
}
