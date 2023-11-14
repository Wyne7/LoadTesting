package com.mit.transcation.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RequestDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AccountDTO accountDTO;
	private AccountTranscationDTO accountTranscationDTO;
	public AccountDTO getAccountDTO() {
		return accountDTO;
	}
	public void setAccountDTO(AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}
	public AccountTranscationDTO getAccountTranscationDTO() {
		return accountTranscationDTO;
	}
	public void setAccountTranscationDTO(AccountTranscationDTO accountTranscationDTO) {
		this.accountTranscationDTO = accountTranscationDTO;
	}
	

}
