package com.alanbinu.Spring.boot.Kafka.Mocroservices.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic alanTopic(){
        return TopicBuilder.name("alanbinu").build();
    }
}
