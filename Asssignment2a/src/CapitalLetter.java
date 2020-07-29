import java.util.Scanner;

public class CapitalLetter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter word");
		String str = s.nextLine();
		LetterCapitalize(str);

	}
	public static void LetterCapitalize(String mystr) {
		String output = mystr.substring(0, 1).toUpperCase() + mystr.substring(1);
		System.out.println(output);
	}

}
