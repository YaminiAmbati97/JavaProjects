import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the  num");
		int i = s.nextInt();
		FirstFactorial(i);
	}
	
	public static void FirstFactorial(int n) {
		int fact=1;
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
		
		System.out.println(fact);	
	}

}
