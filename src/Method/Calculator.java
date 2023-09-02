package Method;

import java.util.Scanner;

public class Calculator {
	public void cal(int No1, int No2) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter 1st no");
	    // No1 = sc.nextInt();
		//System.out.println("Enter 2nd no");
		//No2 = sc.nextInt();
		System.out.println("Select Operator : +, -, *, /");
		char operator = sc.next().charAt(0);
		int result;
		switch (operator) {
		case '+':
			result = No1 + No2;
			System.out.println("Addition of two no is= " + result);
			break;
		case '-':
			result = No1 - No2;
			System.out.println("Subtraction of two no is= " + result);
			break;
		case '*':
			result = No1 * No2;
			System.out.println("Multification of two no is= " + result);
			break;
		case '/':
			result = No1 / No2;
			System.out.println("Division of two no is= " + result);
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int No1 = sc.nextInt();
		System.out.println("Enter 2nd no");
		int No2 = sc.nextInt();
		Calculator obj = new Calculator();
		obj.cal(No1, No2);
	}
}
