package String;
import java.util.Scanner;

public class CheckVowelSwitchCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet for check vowel or consonant");
		char ch = sc.next().charAt(0);
		char ch1 = Character.toLowerCase(ch);
		switch (ch1) {
		case 'a':
			System.out.println(ch1 + " is a vowel");
			break;
		case 'e':
			System.out.println(ch1 + " is a vowel");
			break;
		case 'i':
			System.out.println(ch1 + " is a vowel");
			break;
		case 'o':
			System.out.println(ch1 + " is a vowel");
			break;
		case 'u':
			System.out.println(ch1 + " is a vowel");
			break;
		default:
			System.out.println(ch1 + " is a Consonant");
			break;
		}
	}
}
