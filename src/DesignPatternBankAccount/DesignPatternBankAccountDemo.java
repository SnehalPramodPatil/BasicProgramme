package DesignPatternBankAccount;

import java.util.Scanner;

public class DesignPatternBankAccountDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Please enter\n" + "P for Personal Account\n" + "B for Business Account\n" + "C for Checking Account");

		String input = sc.nextLine();

		//BankAccount b1 = null;

		//BankAccountFactory bb = new BankAccountFactory();

		BankAccount b1 = BankAccountFactory.createAccount(input);

		b1.registeredAccount();
		
	}
}
