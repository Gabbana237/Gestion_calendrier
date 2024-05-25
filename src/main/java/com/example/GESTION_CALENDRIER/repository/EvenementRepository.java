package com.example.GESTION_CALENDRIER.repository;

import com.example.GESTION_CALENDRIER.model.Evenement;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    
    List<Evenement> findByDateDebut(String dateDebut);


}



