package com.cg.dao;

import com.cg.beans.Account;
import com.cg.beans.Loan;
import com.cg.beans.Transaction;
import com.cg.service.BankService;

public class BankDAOImp implements BankDAO{
	Account[] accounts = new Account[10];//Util util =  new Util();
	Loan[] loans = new Loan[10];
	private static int accIdx = 0;
	private static int lnIdx = 0;
	double newAmount=0;
	
	@Override
	public void createAccount(Account account) {
		if(accIdx < 9) {
			accounts[accIdx++]=account;
            //System.out.println(account);//Your a/c has been created successfully
            
		}else
			System.out.println("Can store only 10 account details.Size is full!!");
		
	}
	
//	@Override
//	public void createLoan(Loan loan) {
//		if(lnIdx < 9)
//			loans[lnIdx++]=loan;
//		else
//			System.out.println("Can store only 10 loan details.Size is full!!");
//		
//	}
	@Override
	public Account getDetails(String accountID) {
		 for(Account account:accounts) {
	            if (account.getAccountID().equals(accountID)) {
	                System.out.println(account.getAccountID());
	                System.out.println(account.getAccountName());
	                System.out.println(account.getAddress());
	                System.out.println(account.getDepositAmount());
	                return account;
	            }
	        }
	        return null;
	}

	@Override
	public Account showDetails(String accountID) {
		 for(Account account:accounts) {
	            if (account.getAccountID().equals(accountID)) {
	                System.out.println(account.getAccountID());
	                System.out.println(account.getAccountName());
	                System.out.println(account.getAddress());
	                System.out.println(account.getDepositAmount());
	                return account;
	            }
	        }
	        return null;
	}

	@Override
	public double depositAmount(String accountID, double amount) {
		for(Account account:accounts) {
            if (account.getAccountID().equals(accountID)) {
            	newAmount = account.getDepositAmount()+amount;
				account.setDepositAmount(newAmount);
				//System.out.println("Deposit successful");
				break;
            }
        }
        return newAmount;
	}

	@Override
	public double withdrawAmount(String accountID, double amount) {
		for(Account account:accounts) {
            if (account.getAccountID().equals(accountID)) {
            	newAmount = account.getDepositAmount()-amount;
				account.setDepositAmount(newAmount);
				//System.out.println("Withdraw successful");
				break;
            }
        }
        return newAmount;
	}

	@Override
	public void getLoan(int loanID, double loanAmount, String loanType) {
		Loan loan=new Loan();
        loan.setLoanID(loanID);
        loan.setLoanAmount(loanAmount);
        loan.setLoanType(loanType);
        if(lnIdx < 9)
			loans[lnIdx++]=loan;
		else
			System.out.println("Can store only 10 loan details.Size is full!!");
        
        
	}

	@Override
	public Loan payLoan(int loanID, double loanAmount) {
		for(Loan loan:loans) {
		  loan.setLoanAmount(loan.getLoanAmount()-loanAmount);
		  return loan;
		}
		return null;
	}

	@Override
	public Loan showLoanDetails(int loanID) {
		for(Loan loan:loans) {
			if(loan.getLoanID()==loanID) {
				return loan;
			}
		}
			return null;
	}

}
