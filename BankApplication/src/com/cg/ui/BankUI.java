package com.cg.ui;

import java.util.Scanner;

import com.cg.beans.Account;
import com.cg.beans.Loan;
import com.cg.exception.AccountIDException;
import com.cg.exception.AccountNameException;
import com.cg.service.BankService;
import com.cg.service.BankServiceImp;

public class BankUI {
	public static void main(String[] args) {
		Account acc = null;
		BankService service = new BankServiceImp();
		Scanner sc=new Scanner(System.in);
		while(true) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Select an option and press enter");
            System.out.println("_______________________________");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit Amount");
            System.out.println("3.WithDraw Amount");
            System.out.println("4.Show Account Details");
            System.out.println("5.Apply Loan");
            System.out.println("6.Pay Loan");
            System.out.println("7.Show Loan details");
            System.out.println("8.Exit");
            System.out.println("_______________________________");
            int choice = sc.nextInt();
            switch(choice){
                case 1: {
                    acc = new Account();
                    System.out.println("Enter your Account ID(Eg:[1234567-ABCD]:");
                    while (true) {
                       String AccountID = sc.next();
                        if (service.validateAccountID(AccountID)) {
                            acc.setAccountID(AccountID);
                            break;
                        } else
                            throw new AccountIDException();
                    }
                    System.out.println("Enter your Name(First letter Should be in Upper case):");
                    while (true) {
                        String AccountName = sc.next();

                      if (service.validateAccountName(AccountName)) {
                            acc.setAccountName(AccountName);
                            break;
                        }else throw new AccountNameException();
                    }
                    System.out.println("Enter your Address:");
                    acc.setAddress(sc.next());
                    System.out.println("Enter Deposit Amount:");
                    acc.setDepositAmount((double)sc.nextDouble());
                    //accounts[i]=acc;i++;
                    service.createAccount(acc);
                    System.out.println("Your Account has been successfully created");
                    break;
                }
                case 2:{ // deposit
                    System.out.println("enter your AccountId ex :[1234567-ASDF] ");
                    while (true) {
                    	String AccountID = sc.next();
                    	  if (service.validateAccountID(AccountID)) {
                    		  System.out.println("Enter deposit Amount : ");
                              int amount = sc.nextInt();
                              double finalAmount=service.depositAmount( AccountID, amount);
                              System.out.println("New balance is:  "+finalAmount);
                              break;
                    	  }
                    	  else {
                    		  throw new AccountIDException();
                    	  }
                    }
                    break;
                }
                case 3:{//withdraw
                    System.out.println("enter your AccountId ex :[1234567-ASDF] ");
                    while (true) {
                    	String AccountID = sc.next();
                    	  if (service.validateAccountID(AccountID)) {
                    		  System.out.println("Enter withdrawal Amount : ");
                              int amount = sc.nextInt();
                              double finalAmount=service.withdrawAmount(AccountID, amount);
                              System.out.println("New balance is:  "+finalAmount);
                              break;
                    	  }
                    	  else {
                    		  throw new AccountIDException();
                    	  }
                    }
                    break;
                }
                case 4:{//show a/c details
                    System.out.println("Enter your AccountId ex :[1234567-ASDF] ");
                    while (true) {
                    	String AccountID = sc.next();
                    	  if (service.validateAccountID(AccountID)) {
                    		  Account account = service.getDetails(AccountID);
                    		  if(account!=null) {
                    			  System.out.println("Your account details are: ");
                    			  System.out.println(account);
                    		  }
                    		  else {
                    			  System.out.println("Not found");
          						  break; 
                    		  }
                              break;
                    	  }
                    	  else {
                    		  throw new AccountIDException();
                    	  }
                    }
                    break;
                }
                case 5:{//Apply/create loan
                    Loan loan=new Loan();
                    System.out.println("Enter Loan Type: 1.Home 2.Car 3.Education");
                    String loanType = sc.next();
                    System.out.println("Enter LoanAmount : ");
                    double loanAmount = sc.nextDouble();
                    
                    int loanID = (int)(Math.random()*10);
                    loan.setLoanID(loanID);
                    System.out.println("Your loanId is: "+loanID);
                    
                    System.out.println("Loan Applied");
                    service.getLoan(loanID,loanAmount,loanType);
                    //Loan loan = service.showLoanDetails(loanID);
                    //System.out.println("Your loan details are:");
                    //System.out.println(loan);
                    
                    break;
                }
                case 6:{//pay loan
                    System.out.println("Enter your loanId: ");
                    int loanID = sc.nextInt();
					Loan loan = service.showLoanDetails(loanID);
					if(loan!=null) {
						System.out.println("Your Loan Amount is: "+loan.getLoanAmount() + "and Loan type is:"+loan.getLoanType());
						System.out.println("Enter the amount you want to pay:");
	                    double loanAmount=sc.nextDouble();
	                    System.out.println(service.payLoan(loanID,loanAmount));
	                    break;
					}else {
						System.out.println("loanId not matched");
					}
                    break;
                }
                case 7:{// show loan details
                    System.out.println("Enter your LoanId:  ");
                    int loanID = sc.nextInt();
                    Loan loan = service.showLoanDetails(loanID);
                    if(loan!=null) {
						System.out.println("Your Loan Amount is: "+loan.getLoanAmount() + "and Loan type is:"+loan.getLoanType());
	                    break;
					}else {
						System.out.println("loanId not matched");
					}
                    break;
                }
                case 8:{//exit
                    System.out.println("Thank you, Have a nice day");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Invalid choice");
                    break;
                }
            }
            
            
		}
	}
}
