package com.mit.transcation.kafkaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mit.transcation.dto.AccountDTO;
import com.mit.transcation.dto.RequestDTO;
import com.mit.transcation.service.AccountTranscationService;
import com.mit.transcation.serviceInterface.AccountTranscatioinServiceInterface;

@Service
public class KafkaConsumer {
	
	private final KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	AccountTranscatioinServiceInterface accountTranscatioinServiceInterface;
	public KafkaConsumer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	@KafkaListener(topics = "transcation-topic", groupId = "transcation")
	public void consumeOrderEvent(String message) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			AccountDTO requestDTO = objectMapper.readValue(message, AccountDTO.class);
			accountTranscatioinServiceInterface.saveAccountTranscation(requestDTO);
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

	}

}
