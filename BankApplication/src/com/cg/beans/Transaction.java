package com.cg.beans;

import com.cg.service.BankService;
import com.cg.service.BankServiceImp;

public class Transaction extends Loan {
	private double amount;
	BankService service = new BankServiceImp();
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + "]";
	}
	

}
