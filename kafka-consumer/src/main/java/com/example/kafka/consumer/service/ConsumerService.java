package com.example.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@KafkaListener(topics="rashmi", groupId="myGroup")
	public void consumeMessage(String message) {
		System.out.println("Message Receieved  "+message);
	}
}
