package com.example.kafka.springbootkafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final String TOPIC = "test_topic";
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){

        this.kafkaTemplate.send(TOPIC,message);
    }

    @Bean
    public NewTopic createTopic(){

        return new NewTopic(TOPIC,3,(short) 1);
    }



}
