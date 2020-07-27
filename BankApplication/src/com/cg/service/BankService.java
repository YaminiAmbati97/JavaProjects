package com.cg.service;

import com.cg.beans.Account;
import com.cg.beans.Loan;

public interface BankService {
	public boolean validateAccountID(String id);
	public boolean validateAccountName(String name);
	
	public void createAccount(Account account);
	public Account getDetails(String accountID);
	public Account showDetails(String accountID);
	public double depositAmount(String accountID, double amount);
	public double withdrawAmount(String accountID, double amount) ;
	
	//public void createLoan(Loan loan);
	public void getLoan(int loanID, double loanAmount, String loanType);
	public Loan payLoan(int loanID, double loanAmount);
	public Loan showLoanDetails(int loanID);


}
