package com.example.GESTION_CALENDRIER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.GESTION_CALENDRIER.model.Evenement;
import com.example.GESTION_CALENDRIER.repository.EvenementRepository;

@RestController
@RequestMapping("/evenements")
public class EvenementController {

    @Autowired
    private EvenementRepository evenementRepository;

    @PostMapping
    public ResponseEntity<Evenement> createEvenement(@RequestBody Evenement evenement) {
        Evenement savedEvenement = evenementRepository.save(evenement);
        return new ResponseEntity<>(savedEvenement, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Evenement> updateEvenement(@PathVariable String id, @RequestBody Evenement evenementDetails) {
        Evenement evenement = evenementRepository.findById(id).orElse(null);
        if (evenement != null) {
            // Mise à jour des détails de l'événement existant avec les détails fournis
            evenement.setIdServiceAdmin(evenementDetails.getIdServiceAdmin());
            evenement.setIdCalendrier(evenementDetails.getIdCalendrier());
            evenement.setIdServiceAdminSupprimer(evenementDetails.getIdServiceAdminSupprimer());
            evenement.setIdServiceAdminModifier(evenementDetails.getIdServiceAdminModifier());
            evenement.setDateDebut(evenementDetails.getDateDebut());
            evenement.setDateFin(evenementDetails.getDateFin());
            evenement.setLieu(evenementDetails.getLieu());
            evenement.setDescription(evenementDetails.getDescription());
            evenement.setHeureDebut(evenementDetails.getHeureDebut());
            evenement.setHeureFin(evenementDetails.getHeureFin());

            // Enregistrer les modifications dans la base de données
            Evenement updatedEvenement = evenementRepository.save(evenement);
            return new ResponseEntity<>(updatedEvenement, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
   
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteEvenement(@PathVariable String id) {

            Evenement evenement = evenementRepository.findById(id).orElse(null);
            if (evenement != null) {
                evenementRepository.delete(evenement);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    }
}

