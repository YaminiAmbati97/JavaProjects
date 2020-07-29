import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String first=sc.next();
		System.out.println("enter second string");
		String second=sc.next();
		char firstarray[]=first.toCharArray();
		char secondarray[]=second.toCharArray();
		Arrays.sort(firstarray);
		Arrays.sort(secondarray);
		String sortFirst=new String(firstarray);
		String sortSecond=new String(secondarray);
		if(sortFirst.equals(sortSecond))
		{
			System.out.println("Strings are anagram");
		}
		else {
				System.out.println("Strings are not an anagram");	
		}
	}

}
