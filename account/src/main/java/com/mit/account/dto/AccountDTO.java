package com.mit.account.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AccountDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accNumber;
	private String lastUpDate;
	private Integer status;
	private Double amount;
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getLastUpDate() {
		return lastUpDate;
	}
	public void setLastUpDate(String lastUpDate) {
		this.lastUpDate = lastUpDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	
	
	

}
