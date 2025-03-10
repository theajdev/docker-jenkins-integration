package com.aj.docker_jenkins_integration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aj.docker_jenkins_integration.mail.MailSender;

import jakarta.mail.MessagingException;

@RestController
public class MailController {

	private MailSender mailSender;
	
	public MailController(MailSender smtpMailSender) {
		this.mailSender=smtpMailSender;
	}

	@RequestMapping("/mail")
	public String mail() throws MessagingException {
		mailSender.send("asksoftwares1@gmail.com", "test mail", "Body of the mail sender.");
		return "mail sent";
	}
}
