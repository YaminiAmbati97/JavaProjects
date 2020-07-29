package Main;

import java.util.Scanner;

public class Main {
	private double discount;
	
	   public double Calculation(double amount, int choice) {
			
			double finalPrice=0;
			
			switch(choice) {
			
			case 1:
			    discount= (amount*30)/100;
			    finalPrice=amount-discount;
			 	break;
			case 2:
				 discount= (amount*10)/100;
				 finalPrice=amount-discount;
				 break;
			case 3:
			     discount= (amount*5)/100;
			     finalPrice=amount-discount;
				 break;
			
			case 4:
				int amt=(int) (amount/100);
				discount=amt*5;
				finalPrice=amount-discount;
				break;
				
			case 5:
				finalPrice=amount;
				break;
				
			 default:  
			     System.out.println("Sorry, you made an invalid choice. Please select above options");
			     System.exit(0);
			     
			}
			
			return finalPrice;
		}


	public static void main(String[] args) {
		Main market=new Main();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Select type of Customer\n 1.Employee of the store\n 2.Affiliate of the store\n 3.Customer for 2 years \n 4.None of the above \n 5.No discount on Groceries ");
		int choice=scanner.nextInt();
		System.out.println("Enter Customer Name");
		String customerName=scanner.next();
		System.out.println("Enter the bill amount");
		double billamount=scanner.nextDouble();
		
		System.out.println("Total bill :"+market.Calculation(billamount, choice));
			
		}
		 

}
