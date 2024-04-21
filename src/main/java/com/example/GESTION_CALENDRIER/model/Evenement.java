 package com.example.GESTION_CALENDRIER.model;

 import jakarta.persistence.*;

 @Entity
 @Table(name = "EVENEMENT")
 public class Evenement {
  @Id
  @GeneratedValue
      private String id; // Supposez que l'identifiant est de type String

        // Getter et Setter pour l'identifiant
      public String getId() {
         return id;
     }

      public void setId(String id) {
        this.id = id;
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