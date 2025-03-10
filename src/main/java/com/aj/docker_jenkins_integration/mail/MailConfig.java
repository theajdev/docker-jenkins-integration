package com.aj.docker_jenkins_integration.mail;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MailConfig {

	@Bean
	public MockMailSender mockMailSender() {
		return new MockMailSender();
	}

	@Bean
	public SmtpMailSender smtpMailSender(JavaMailSender javaMailSender) {
		return new SmtpMailSender(javaMailSender);
	}
}
