package Inheritance;

import java.util.Scanner;

class one {
	int a, b;

	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		a = sc.nextInt();
		System.out.println("Enter 2nd no");
		b = sc.nextInt();
	}
}

class two extends one {
	public void add() {
		System.out.println("Addition= " + (a + b));
	}
}

class three extends one {
	public void subtract() {
		System.out.println("Subtraction= " + (a - b));
	}
}
public class AddHeirarchical {
	public static void main(String args[]) { 
		two a = new two();
		a.input1();
		a.add();
		three c = new three();
		c.input1();
		c.subtract();
	}
}
