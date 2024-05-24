package com.example.GESTION_CALENDRIER.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.GESTION_CALENDRIER.model.Evenement;


@Service
public class RappelService {
    
    @Autowired
    private EvenementService localEventService;

    @Autowired
    private EmailService emailService;

    @Autowired
    private SmsService smsService;

    @Scheduled(fixedRate = 60000) // Exécute cette tâche toutes les minutes
    public void sendEventRappels() {
        List<Evenement> upcomingEvents = EvenementService.getAllEvents();

        for (Evenement event : upcomingEvents) {
            if (shouldSendReminder(event, Duration.ofHours(1), event.isReminderOneHourSent())) {
                sendReminder(event, "Reminder: " + event.getTitle() + " debute dans une heure!");
                event.setReminderOneHourSent(true);
                localEventService.saveEvent(event); // sauvegarder l'état de l'événement
            } else if (shouldSendReminder(event, Duration.ofDays(1), event.isReminderOneDaySent())) {
                sendReminder(event, "Reminder: " + event.getTitle() + " Debut dans un jour!");
                event.setReminderOneDaySent(true);
                localEventService.saveEvent(event); // sauvegarder l'état de l'événement
            }
        }
    }

    private boolean shouldSendReminder(Evenement event, Duration reminderDuration, boolean reminderSent) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime eventTime = event.getStartTime();
        return !reminderSent && now.plus(reminderDuration).isAfter(eventTime) && eventTime.isAfter(now);
    }

    private void sendReminder(Evenement event, String message) {
        emailService.sendSimpleMailMessage(event.getEmail(), "Rappel de l'evenement", message);
        smsService.sendSms(event.getPhoneNumber(), message);
    }

}
