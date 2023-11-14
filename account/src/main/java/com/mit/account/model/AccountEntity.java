package com.mit.account.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Accounts")
public class AccountEntity  extends Util{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


    @Column(name = "AccNumber", length = 30, nullable = false)
    private String accNumber;

    @Column(name = "CurrencyCode", length = 10, nullable = false)
    private String currencyCode;

    @Column(name = "OpeningBalance", nullable = false)
    private Double openingBalance;

    @Column(name = "OpeningDate", nullable = false)
    private String openingDate;

    @Column(name = "CurrentBalance", nullable = false)
    private Double currentBalance;

    @Column(name = "ClosingDate", nullable = false)
    private String closingDate;

    @Column(name = "LastUpDate", nullable = false)
    private String lastUpDate;

    @Column(name = "Status", nullable = false)
    private Integer status;

    @Column(name = "LastTransDate", nullable = false)
    private String lastTransDate;

    @Column(name = "DrawType", length = 50, nullable = false)
    private String drawType;

    @Column(name = "AccName", length = 255, nullable = false)
    private String accName;

    @Column(name = "AccNRC", length = 100, nullable = false)
    private String accNRC;

    @Column(name = "SAccNo", length = 255, nullable = false)
    private String sAccNo;

    @Column(name = "Remark", length = 255, nullable = false)
    private String remark;

    @Column(name = "BranchCode", length = 50, nullable = false)
    private String branchCode;

    
	public String getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(String openingDate) {
		this.openingDate = openingDate;
	}

	public String getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(String closingDate) {
		this.closingDate = closingDate;
	}

	public String getLastTransDate() {
		return lastTransDate;
	}

	public void setLastTransDate(String lastTransDate) {
		this.lastTransDate = lastTransDate;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(Double openingBalance) {
		this.openingBalance = openingBalance;
	}

	
	public Double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
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

	

	public String getDrawType() {
		return drawType;
	}

	public void setDrawType(String drawType) {
		this.drawType = drawType;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNRC() {
		return accNRC;
	}

	public void setAccNRC(String accNRC) {
		this.accNRC = accNRC;
	}

	public String getsAccNo() {
		return sAccNo;
	}

	public void setsAccNo(String sAccNo) {
		this.sAccNo = sAccNo;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
    
    
    

}