package com.alanbinu.Spring.boot.Kafka.Mocroservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringBootKafkaMocroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaMocroservicesApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return args -> {
			for (int i = 0; i < 100; i++) {
				kafkaTemplate.send("alanbinu", "hello Alan "+i);
			}
		};
	}

}
