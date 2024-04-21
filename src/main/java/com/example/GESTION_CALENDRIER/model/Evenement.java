package com.example.GESTION_CALENDRIER.model;

import jakarta.persistence.*;

@Entity
@Table(name = "EVENEMENT")
public class Evenement {
    
    @Id
    @Column(name = "I")
    private String i;

    @Column(name = "ID_SERVICE_ADMIN")
    private String idServiceAdmin;

    @Column(name = "ID_CALENDRIER")
    private String idCalendrier;

    @Column(name = "ID_SERVICE_ADMIN_SUPPRIMER")
    private String idServiceAdminSupprimer;

    @Column(name = "ID_SERVICE_ADMIN_MODIFIER")
    private String idServiceAdminModifier;

    @Column(name = "DATE_DEBUT")
    private String dateDebut;

    @Column(name = "DATE_FIN")
    private String dateFin;

    @Column(name = "LIEU")
    private String lieu;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "HEURE_DEB")
    private String heureDebut;

    @Column(name = "HEURE_FIN")
    private String heureFin;

    // Constructor, getters, and setters
}