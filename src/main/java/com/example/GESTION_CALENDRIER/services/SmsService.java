package com.example.GESTION_CALENDRIER.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Service
public class SmsService {
    
    @Value("${twilio.accountSid}")
    private String accountSid;

    @Value("${twilio.authToken}")
    private String authToken;

    @Value("${twilio.phoneNumber}")
    private String fromPhoneNumber;

    public SmsService() {
        Twilio.init(accountSid, authToken);
    }

    public void sendSms(String to, String message) {
        Message.creator(new PhoneNumber(to), new PhoneNumber(fromPhoneNumber), message).create();
    }
}
