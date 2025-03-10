package com.aj.docker_jenkins_integration.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

public class MockMailSender implements MailSender {

	private static Log log = LogFactory.getLog(MockMailSender.class);
	
	@Override
	public void send(String to, String subject, String body) {
		log.info("sending mock mail to " + to);
		log.info("with subject " + subject);
		log.info("and body " + body);
	}

}
