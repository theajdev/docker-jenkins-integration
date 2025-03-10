package com.aj.docker_jenkins_integration.mail;

import jakarta.mail.MessagingException;

public interface MailSender {
	void send(String to, String subject, String body)throws MessagingException;
}
