package com.hns.gate.smtp;
 
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SmtpClient {
	 
	 public void sendMail(String smtpServer, String from, String to, String objet, String texte) {
	     try {

	 		Properties props = System.getProperties();
	 		props.put("mail.smtp.host", smtpServer);
	 		props.setProperty("mail.transport.protocol", "smtp");
	 		props.setProperty("mail.host", "smtp.gmail.com");
	 		props.put("mail.smtp.auth", "true");
	 		props.put("mail.smtp.port", "465");
	 		props.put("mail.debug", "true");
	 		props.put("mail.smtp.socketFactory.port", "465");
	 		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	 		props.put("mail.smtp.socketFactory.fallback", "false");

	 		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
	 			protected PasswordAuthentication getPasswordAuthentication() {
	                 return new PasswordAuthentication("mehdic12@gmail.com", "sdsdsdsdsdsdsdsdsdsssdsds");
	 			}
	 		});
	 		
	 		Message msg = new MimeMessage(session);
	 		Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(objet);
			message.setText(texte);
			Transport.send(message);
		 	 
	     } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println("Error during API call");
	     }
	 }




}