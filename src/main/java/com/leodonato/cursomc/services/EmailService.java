package com.leodonato.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.leodonato.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
		
	void sendEmail(SimpleMailMessage msg);

}
