package com.example.kafka.producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.producer.service.ProducerService;

@RestController
@RequestMapping
public class ProducerController {

	private ProducerService kafkaProducer;
	
	public ProducerController(ProducerService kafkaProducer) {
		super();
		this.kafkaProducer = kafkaProducer;
	}
	
	@GetMapping("/test")
	public String test(){
		return "Hiii";
	}
	@GetMapping("/produce")
	public ResponseEntity<String> publish(@RequestParam("message") String message){
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message sent from Kafka producer");
	}

}
