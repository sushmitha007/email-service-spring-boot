package com.stackroute.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootApplication
public class EmailApplication implements CommandLineRunner {
	@Autowired
	public JavaMailSender javaMailSender;

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo("sushmitha.cs18@gmail.com");
		simpleMailMessage.setFrom("contactshopperzoid@gmail.com");
		simpleMailMessage.setText("hiiiiii");
		javaMailSender.send(simpleMailMessage);

	}
}
