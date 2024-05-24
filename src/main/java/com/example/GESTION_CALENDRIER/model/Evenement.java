 package com.example.GESTION_CALENDRIER.model;

 import java.time.LocalDateTime;

import jakarta.persistence.*;

 @Entity
 public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Supposez que l'identifiant est de type String

     private String idServiceAdmin;

     
     private String idCalendrier;

     
     private String idServiceAdminSupprimer;

    
     private String idServiceAdminModifier;

     
     private String dateDebut;

     
     private String dateFin;

  
     private String lieu;

     
     private String description;

     
     private String heureDebut;

    
     private String heureFin;

    private String title;
    private LocalDateTime startTime;
    private String email;
    private String phoneNumber;

    private boolean reminderOneHourSent = false;
    private boolean reminderOneDaySent = false;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getIdServiceAdmin() {
        return idServiceAdmin;
    }


    public void setIdServiceAdmin(String idServiceAdmin) {
        this.idServiceAdmin = idServiceAdmin;
    }


    public String getIdCalendrier() {
        return idCalendrier;
    }


    public void setIdCalendrier(String idCalendrier) {
        this.idCalendrier = idCalendrier;
    }


    public String getIdServiceAdminSupprimer() {
        return idServiceAdminSupprimer;
    }


    public void setIdServiceAdminSupprimer(String idServiceAdminSupprimer) {
        this.idServiceAdminSupprimer = idServiceAdminSupprimer;
    }


    public String getIdServiceAdminModifier() {
        return idServiceAdminModifier;
    }


    public void setIdServiceAdminModifier(String idServiceAdminModifier) {
        this.idServiceAdminModifier = idServiceAdminModifier;
    }


    public String getDateDebut() {
        return dateDebut;
    }


    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }


    public String getDateFin() {
        return dateFin;
    }


    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }


    public String getLieu() {
        return lieu;
    }


    public void setLieu(String lieu) {
        this.lieu = lieu;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getHeureDebut() {
        return heureDebut;
    }


    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }


    public String getHeureFin() {
        return heureFin;
    }


    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }


    public Evenement(String title, LocalDateTime startTime, String email, String phoneNumber) {
        this.title = title;
        this.startTime = startTime;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isReminderOneHourSent() {
        return reminderOneHourSent;
    }

    public void setReminderOneHourSent(boolean reminderOneHourSent) {
        this.reminderOneHourSent = reminderOneHourSent;
    }

    public boolean isReminderOneDaySent() {
        return reminderOneDaySent;
    }

    public void setReminderOneDaySent(boolean reminderOneDaySent) {
        this.reminderOneDaySent = reminderOneDaySent;
    }

    public Evenement() {
    }

}