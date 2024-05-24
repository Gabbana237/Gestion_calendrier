package com.example.GESTION_CALENDRIER.exception;



    public class EvenementNotFoundException extends RuntimeException{
        public EvenementNotFoundException(Long id) {
            super("Could not found the event with the id" + id);
        }
    }

