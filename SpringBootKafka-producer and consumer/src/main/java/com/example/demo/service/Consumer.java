package com.example.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
  
	@KafkaListener(topics="mytopic", groupId="mygroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consummed message "+message);
	}
}
