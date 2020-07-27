package com.cg.beans;

import com.cg.service.BankService;
import com.cg.service.BankServiceImp;

public class Loan extends Account {
	private int loanID;
	private String loanType;
	private double loanAmount;
	BankService service = new BankServiceImp();
	public int getLoanID() {
		return loanID;
	}
	public void setLoanID(int loanID) {
		this.loanID = loanID;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "Loan [loanID=" + loanID + ", loanType=" + loanType + ", loanAmount=" + loanAmount + "]";
	}
	
	
	
	

}
