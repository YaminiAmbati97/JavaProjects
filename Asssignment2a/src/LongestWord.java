import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter word");
		String str = s.nextLine();
		LongestWord(str);
	}
	public static void LongestWord(String mystr) {
        String[] word=mystr.split(" ");
        String maxWord=" ";
        for(int i=0;i<word.length;i++){
        	if(word[i].length() >= maxWord.length()){
                  maxWord = word[i];
            } 
        }
        System.out.println(maxWord+" is longest word with "+maxWord.length()+" characters");
     
	}

}
