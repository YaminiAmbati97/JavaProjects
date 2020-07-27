package com.cg.dao;

import com.cg.beans.Account;
import com.cg.beans.Loan;

public interface BankDAO {
	
	public void createAccount(Account account);
	public Account getDetails(String accountID);
	public Account showDetails(String accountID);
	public double depositAmount(String accountID, double amount);
	public double withdrawAmount(String accountID, double amount) ;
	
	//Spublic void createLoan(Loan loan);
	public void getLoan(int loanID, double loanAmount, String loanType);
	public Loan payLoan(int loanID, double loanAmount);
	public Loan showLoanDetails(int loanID);

}
