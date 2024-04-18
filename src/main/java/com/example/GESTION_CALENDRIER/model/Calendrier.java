package com.example.GESTION_CALENDRIER.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Calendrier {
    
    @Id
    @GeneratedValue
    private String idCalendrier;
    private String session;

    public Calendrier(String idCalendrier, String session) {
        this.idCalendrier = idCalendrier;
        this.session = session;
    }
    public String getIdCalendrier() {
        return idCalendrier;
    }
    public void setIdCalendrier(String idCalendrier) {
        this.idCalendrier = idCalendrier;
    }
    public String getSession() {
        return session;
    }
    public void setSession(String session) {
        this.session = session;
    }
    

    

    
}