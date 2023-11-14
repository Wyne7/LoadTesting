package com.mit.account.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class RequestDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AccountDTO accountDTO;
	public AccountDTO getAccountDTO() {
		return accountDTO;
	}
	public void setAccountDTO(AccountDTO accountDTO) {
		this.accountDTO = accountDTO;
	}
	

}
