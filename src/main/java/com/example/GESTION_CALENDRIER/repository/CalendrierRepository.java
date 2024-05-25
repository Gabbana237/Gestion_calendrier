package com.example.GESTION_CALENDRIER.repository;

import com.example.GESTION_CALENDRIER.model.Calendrier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalendrierRepository extends JpaRepository<Calendrier, Integer> {
    // Add custom methods here if needed
}
