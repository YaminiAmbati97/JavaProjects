import java.util.Scanner;

public class PrimeFactors {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner s = new Scanner(System.in);
	    System.out.println("enter the num");
	    int n = s.nextInt();
	    primeFactor(n);
	}
	public static void primeFactor(int num) {
		for(int i=2; num>1; i++) {
			while(num%i == 0) {
				System.out.println(i);
				num = num/i;
			}
		}
		
	}

}
