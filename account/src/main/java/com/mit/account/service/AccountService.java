package com.mit.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mit.account.dto.AccountDTO;
import com.mit.account.dto.RequestDTO;
import com.mit.account.kafkaService.KafkaProducer;
import com.mit.account.model.AccountEntity;
import com.mit.account.repository.AccountRepository;
import com.mit.account.serviceInterface.AccountServiceInterface;

import jakarta.transaction.Transactional;

@Service
public class AccountService implements AccountServiceInterface {
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private KafkaProducer kafkaProducer;
	@Override
	public void saveAccount(RequestDTO requestDTO) {
		Double currentAmount = accountRepository.findByAccountNumber(requestDTO.getAccountDTO().getAccNumber());

	
		if (requestDTO.getAccountDTO().getStatus() != 0) {
			requestDTO.getAccountDTO().setAmount(currentAmount + requestDTO.getAccountDTO().getAmount());
			accountUpdate(requestDTO);
			
		} else {
			if (currentAmount != 0) {
				requestDTO.getAccountDTO().setAmount(currentAmount - requestDTO.getAccountDTO().getAmount());
				accountUpdate(requestDTO);
				
			}

		}
	

	}

	@Transactional
	public void accountUpdate(RequestDTO requestDTO) {
		AccountEntity entity = accountRepository.findByAccNumber(requestDTO.getAccountDTO().getAccNumber());
		entity.setCurrentBalance(requestDTO.getAccountDTO().getAmount());
		entity.setLastUpDate(requestDTO.getAccountDTO().getLastUpDate());
		entity.setStatus(requestDTO.getAccountDTO().getStatus());
		try {
			accountRepository.save(entity);
			kafkaProducer.sendTranscSuccess(requestDTO.getAccountDTO());
		} catch (Exception e) {
		}

	}

}
