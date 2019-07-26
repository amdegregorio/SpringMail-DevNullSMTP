package com.amydegregorio.devnullsmtp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.amydegregorio.devnullsmtp.dto.Email;

@Service
public class EmailService {
   @Autowired
   private JavaMailSender mailSender;
   
    public boolean sendEmail(Email email) {
       SimpleMailMessage message = new SimpleMailMessage();
       message.setFrom(email.getFromAddress());
       message.setTo(email.getToAddress());
       message.setSubject(email.getSubject());
       
       message.setText(email.getMessage());
       try {
          mailSender.send(message);
          return true;
       } catch (MailException e) {
          e.printStackTrace();
          return false;
       }
    }
}
