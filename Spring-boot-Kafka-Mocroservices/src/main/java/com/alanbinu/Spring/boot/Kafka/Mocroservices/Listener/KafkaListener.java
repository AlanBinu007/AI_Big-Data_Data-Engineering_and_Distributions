package com.alanbinu.Spring.boot.Kafka.Mocroservices.Listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "alanbinu",groupId = "groupID")
    void Listener(String data){
        System.out.println("Received the data : "+data+" ");
    }

}
