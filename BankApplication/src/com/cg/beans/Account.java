package com.cg.beans;

import com.cg.service.BankService;
import com.cg.service.BankServiceImp;

public class Account {
	private String accountID;
	private String accountName;
	private String address;
	private double depositAmount;

	public Account() {
		super();
	}
	public Account(String accountID, String accountName,String address, double depositAmount) {
		super();
		this.accountID = accountID;
		this.accountName = accountName;
		this.depositAmount = depositAmount;
		this.address = address;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", accountName=" + accountName + ", address=" + address
				+ ", depositAmount=" + depositAmount +  "]";
	}
	
	

}
