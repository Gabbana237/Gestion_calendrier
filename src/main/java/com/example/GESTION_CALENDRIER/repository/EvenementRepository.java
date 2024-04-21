package com.example.GESTION_CALENDRIER.repository;

import com.example.GESTION_CALENDRIER.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface EvenementRepository extends JpaRepository<Evenement, String> {
     // Add custom methods here if needed
}
