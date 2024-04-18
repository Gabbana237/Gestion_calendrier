package com.example.GESTION_CALENDRIER.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Consulter {
    
    @Id
    @GeneratedValue
    private String idEleve;

    private String idEnseignant;

    private String idParent;

    private String idCalendrier;

    public String getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(String idEleve) {
        this.idEleve = idEleve;
    }

    public String getIdEnseignant() {
        return idEnseignant;
    }

    public void setIdEnseignant(String idEnseignant) {
        this.idEnseignant = idEnseignant;
    }

    public String getIdParent() {
        return idParent;
    }

    public void setIdParent(String idParent) {
        this.idParent = idParent;
    }

    public String getIdCalendrier() {
        return idCalendrier;
    }

    public void setIdCalendrier(String idCalendrier) {
        this.idCalendrier = idCalendrier;
    }


}