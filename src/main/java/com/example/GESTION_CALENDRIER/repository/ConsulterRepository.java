package com.example.GESTION_CALENDRIER.repository;

import com.example.GESTION_CALENDRIER.model.Consulter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsulterRepository extends JpaRepository<Consulter, String> {
    // Add custom methods here if needed
}
