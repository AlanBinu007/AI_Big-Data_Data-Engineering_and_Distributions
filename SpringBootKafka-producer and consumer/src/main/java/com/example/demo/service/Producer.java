package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
  public static final String topic = "mytopic";
  
  @Autowired 
  private KafkaTemplate<String, String> kafkaTemp;
  
  public void publishToTopic(String message) {
	  System.out.println("Publishing to topic "+topic);
	  this.kafkaTemp.send(topic, message);
  }
}
