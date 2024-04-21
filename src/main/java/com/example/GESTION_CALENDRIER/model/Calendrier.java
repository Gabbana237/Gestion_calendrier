package com.example.GESTION_CALENDRIER.model;

import java.sql.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Calendrier {
    
    @Id
    @GeneratedValue
    private Long idCalendrier;
    private Date sessionDebut;
    private Date sessionFin;
    public Long getIdCalendrier() {
        return idCalendrier;
    }
    public void setIdCalendrier(Long idCalendrier) {
        this.idCalendrier = idCalendrier;
    }
    public Date getSessionDebut() {
        return sessionDebut;
    }
    public void setSessionDebut(Date sessionDebut) {
        this.sessionDebut = sessionDebut;
    }
    public Date getSessionFin() {
        return sessionFin;
    }
    public void setSessionFin(Date sessionFin) {
        this.sessionFin = sessionFin;
    }


    

    
}