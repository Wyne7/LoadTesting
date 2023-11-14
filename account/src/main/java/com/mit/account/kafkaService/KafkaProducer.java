package com.mit.account.kafkaService;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mit.account.dto.AccountDTO;
import com.mit.account.dto.RequestDTO;

@Service
public class KafkaProducer {
	
	private final KafkaTemplate<String,String > kafkaTemplate;
    private final ObjectMapper objectMapper=new ObjectMapper();

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    
    public void sendTranscSuccess(AccountDTO dto) {
  		try {
  			String dtoJson = objectMapper.writeValueAsString(dto);
  			 kafkaTemplate.send("transcation-topic",dtoJson);  
  		} catch (JsonProcessingException e) {
  			e.printStackTrace();
  		}
  	         
      }

}