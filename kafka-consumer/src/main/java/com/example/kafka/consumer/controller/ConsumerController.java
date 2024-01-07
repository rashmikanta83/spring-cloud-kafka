package com.example.kafka.consumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafka.consumer.service.ConsumerService;

@RestController
@RequestMapping
public class ConsumerController {

//	private ConsumerService consumerService;
//	
//	public ConsumerController(ConsumerService consumerService) {
//		super();
//		this.consumerService = consumerService;
//	}
//	
//
//	@GetMapping("/consume")
//	public ResponseEntity<String> consume(){
//		//consumerService.consumeMessage();
//		return ResponseEntity.ok("Message Consumed from Kafka producer");
//	}

}
