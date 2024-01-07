package com.example.kafka.producer.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

	private KafkaTemplate<String, String> kafkaTemplate;

	public ProducerService(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		System.out.println("Message sent");
		kafkaTemplate.send("rashmi", message);
	}
}
