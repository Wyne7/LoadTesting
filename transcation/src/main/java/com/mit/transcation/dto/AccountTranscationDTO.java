package com.mit.transcation.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AccountTranscationDTO implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String accNumber;
	 private Integer transNo;
	 private Integer transRef;
	 private String transDate;
	 private String transTime;
	 private String description;
	 private Double amount;
	 private String effectiveDate;
	 private Short transType;
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public Integer getTransNo() {
		return transNo;
	}
	public void setTransNo(Integer transNo) {
		this.transNo = transNo;
	}
	public Integer getTransRef() {
		return transRef;
	}
	public void setTransRef(Integer transRef) {
		this.transRef = transRef;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Short getTransType() {
		return transType;
	}
	public void setTransType(Short transType) {
		this.transType = transType;
	}
	 
	 

}
