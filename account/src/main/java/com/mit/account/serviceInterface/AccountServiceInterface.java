package com.mit.account.serviceInterface;

import org.springframework.stereotype.Service;

import com.mit.account.dto.AccountDTO;
import com.mit.account.dto.RequestDTO;

@Service
public interface AccountServiceInterface {
	
	void saveAccount(RequestDTO requestDTO);

}
