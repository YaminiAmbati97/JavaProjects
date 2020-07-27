package com.cg.service;

import com.cg.beans.Account;
import com.cg.beans.Loan;
import com.cg.dao.BankDAO;
import com.cg.dao.BankDAOImp;

public class BankServiceImp implements BankService{
	private BankDAO dao = new BankDAOImp();

	@Override
	public boolean validateAccountID(String id) {
		String pattern = "^[0-9]{7}+[-]{1}+[A-Za-z]{4}$";
        boolean flag= id.matches(pattern);
        return flag;
	}

	@Override
	public boolean validateAccountName(String name) {
		 String pattern = "^[A-Z]{1}+[a-z]{2,}$";
	     boolean flag=  name.matches(pattern);
	     return flag;
	}
	@Override
	public void createAccount(Account account) {
		dao.createAccount(account);
	}
//	@Override
//	public void createLoan(Loan loan) {
//		dao.createLoan(loan);
//	}
	
	@Override
	public Account getDetails(String accountID) {
		return dao.getDetails(accountID);
	}

	@Override
	public Account showDetails(String accountID) {
		return dao.showDetails(accountID);
	}

	@Override
	public double depositAmount(String accountID, double amount) {
		return dao.depositAmount(accountID, amount);
	}

	@Override
	public double withdrawAmount(String accountID, double amount) {
		return dao.withdrawAmount(accountID, amount);
	}

	@Override
	public void getLoan(int loanID, double loanAmount, String loanType) {
		 dao.getLoan(loanID, loanAmount, loanType);
	}

	@Override
	public Loan payLoan(int loanID, double loanAmount) {
		return dao.payLoan(loanID, loanAmount);
	}

	@Override
	public Loan showLoanDetails(int loanID) {
		return dao.showLoanDetails(loanID);
	}
	

}
