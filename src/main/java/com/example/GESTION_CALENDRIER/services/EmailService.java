package com.example.GESTION_CALENDRIER.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    
    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMailMessage(String to, String subject, String text) {
        SimpleMailMessage eMailMessage = new SimpleMailMessage();
        eMailMessage.setTo(to);
        eMailMessage.setSubject(subject);
        eMailMessage.setText(text);
        emailSender.send(eMailMessage);
    }
}
