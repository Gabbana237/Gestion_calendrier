package com.example.GESTION_CALENDRIER;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


    @Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    
    // Getters and setters
}


