package String;
import java.util.Scanner;

public class PalindromeWordFromGivenString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String rev = "";
		int count = 0;
		System.out.println("Enter the sentences");
		String str = sc.nextLine();
		str = str + " ";
		String word = "";
		for (int i = 0; i < str.length(); i++) 
		{
			if (str.charAt(i) != ' ')
			{
				word = word+ str.charAt(i);
				rev = str.charAt(i)+rev;
				
			} else {
				if (word.equalsIgnoreCase(rev)) {
					System.out.println(word);
					count++;
				}
				word = "";
				rev = "";
			}
		}
		System.out.println("Total pallindrome word in given string are "+count);
	}
}
