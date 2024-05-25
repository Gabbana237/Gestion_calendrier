package com.example.GESTION_CALENDRIER.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.GESTION_CALENDRIER.exception.EvenementNotFoundException;
import com.example.GESTION_CALENDRIER.model.Evenement;
import com.example.GESTION_CALENDRIER.repository.EvenementRepository;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EvenementController {

    @Autowired
    private EvenementRepository evenementRepository;

    // @PostMapping("/evenements")
    // public ResponseEntity<Evenement> createEvenement(@RequestBody Evenement evenement) {
    //     Evenement savedEvenement = evenementRepository.save(evenement);
    //     return new ResponseEntity<>(savedEvenement, HttpStatus.CREATED);
    // }
    @PostMapping("/evenements")
        Evenement newEvenement(@RequestBody Evenement newEvenement){
        return evenementRepository.save(newEvenement);
    }
    @PostMapping("/{id}")
    public ResponseEntity<Evenement> updateEvenement(@PathVariable Long id, @RequestBody Evenement evenementDetails) {
        Evenement evenement = evenementRepository.findById(id).orElse(null);
        if (evenement != null) {
            if (evenementDetails.getIdServiceAdmin() != null) {
                evenement.setIdServiceAdmin(evenementDetails.getIdServiceAdmin());
            }
            if (evenementDetails.getIdCalendrier() != null) {
                evenement.setIdCalendrier(evenementDetails.getIdCalendrier());
            }
            if (evenementDetails.getIdServiceAdminSupprimer() != null) {
                evenement.setIdServiceAdminSupprimer(evenementDetails.getIdServiceAdminSupprimer());
            }
            if (evenementDetails.getIdServiceAdminModifier() != null) {
                evenement.setIdServiceAdminModifier(evenementDetails.getIdServiceAdminModifier());
            }
            if (evenementDetails.getDateDebut() != null) {
                evenement.setDateDebut(evenementDetails.getDateDebut());
            }
            if (evenementDetails.getDateFin() != null) {
                evenement.setDateFin(evenementDetails.getDateFin());
            }
            if (evenementDetails.getLieu() != null) {
                evenement.setLieu(evenementDetails.getLieu());
            }
            if (evenementDetails.getDescription() != null) {
                evenement.setDescription(evenementDetails.getDescription());
            }
            if (evenementDetails.getHeureDebut() != null) {
                evenement.setHeureDebut(evenementDetails.getHeureDebut());
            }
            if (evenementDetails.getHeureFin() != null) {
                evenement.setHeureFin(evenementDetails.getHeureFin());
            }
    
            // Save the updated event in the database
            Evenement updatedEvenement = evenementRepository.save(evenement);
            return new ResponseEntity<>(updatedEvenement, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteEvenement(@PathVariable Long id) {

            Evenement evenement = evenementRepository.findById(id).orElse(null);
            if (evenement != null) {
                evenementRepository.delete(evenement);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }

        @GetMapping("/allevents")
        List<Evenement> getAllUsers(){
        return evenementRepository.findAll();
    }

    @GetMapping("/event/{id}")
    Evenement getEleveById(@PathVariable Long id) {
    	return evenementRepository.findById(id).orElseThrow(()->new EvenementNotFoundException(id));
    }
    
    @GetMapping("/events/{dateDebut}")
    public List<Evenement> getEventsByDateDebut(@PathVariable String dateDebut) {
        // Convertir la chaîne de caractères en LocalDate
        LocalDate dateDebuta = LocalDate.parse(dateDebut, DateTimeFormatter.ISO_DATE);
        // Appeler la méthode du repository
        return evenementRepository.findByDateDebut(dateDebuta.toString());
    }




}

