package com.mit.account.kafkaService;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaConsumer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	public KafkaConsumer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

	@KafkaListener(topics = "success_topic", groupId = "account")
	public void consumeOrderEvent(String message) {
		
	}

}