package com.amydegregorio.devnullsmtp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.amydegregorio.devnullsmtp.dto.Email;
import com.amydegregorio.devnullsmtp.service.EmailService;

@Controller
public class EmailController {
   @Autowired
   private EmailService emailService;

   @GetMapping("/compose")
   public String composeEmail(@ModelAttribute Email email) {
      return "compose";
   }
   
   @PostMapping("/send")
   public String saveWidget(@Valid Email email, Model model) {
      boolean result = emailService.sendEmail(email);
      model.addAttribute("email", email);
      return "sent";
   }
}
