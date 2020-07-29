import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter word");
		String str = s.nextLine();
		ReverseOrder(str);
	}
	
	public static void ReverseOrder(String mystr) {
		String reverse="";
		int len = mystr.length();
		for(int i =len-1;i>=0;i--) {
			reverse = reverse+mystr.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
