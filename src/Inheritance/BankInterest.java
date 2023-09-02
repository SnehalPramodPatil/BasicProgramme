package Inheritance;
import java.util.Scanner;

public class BankInterest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		do {
			System.out.println("Enter a Bank name which you want to check an Interest Rate!");
			String Bankname = sc.next();
			RBI b1;

			if (Bankname.equalsIgnoreCase("SBI")) {
				b1 = new SBI();
				System.out.println(b1.getRateOfInterest());
			} else if (Bankname.equalsIgnoreCase("ICICI")) {
				b1 = new ICICI();
				System.out.println(b1.getRateOfInterest());

			} else {
				System.out.println("Please enter correct Bank Name");
			}
			System.out.println("Do you want to check again Interest Rate");
			input = sc.next();
		} while (input.equalsIgnoreCase("Yes"));
		System.out.println("Thank you!");
	}
}
