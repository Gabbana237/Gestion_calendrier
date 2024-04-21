 package com.example.GESTION_CALENDRIER.model;

 import jakarta.persistence.*;

 @Entity
 @Table(name = "EVENEMENT")
 public class Evenement {
  @Id
  @GeneratedValue
      private String i; // Supposez que l'identifiant est de type String

        // Getter et Setter pour l'identifiant
      public String getId() {
         return i;
     }

      public void setId(String i) {
        this.i = i;
     }
   

     
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

//     // Constructor, getters, and setters
 }