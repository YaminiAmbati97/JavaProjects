import java.util.Scanner;

public class AlphabeticalOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter word");
		String str = s.nextLine();
		AlphabetSoup(str);

	}
	public static void AlphabetSoup(String mystr) {
		char temp;
		String str1 = mystr.toLowerCase();
		char[] charstr = str1.toCharArray();
		int len = charstr.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(charstr[i]>charstr[j]) {
					temp = charstr[i];
					charstr[i]=charstr[j];
					charstr[j]=temp;
				}
			}
		}
		System.out.println(charstr);
	
	}

}
