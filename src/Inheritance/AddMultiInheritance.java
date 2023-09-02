package Inheritance;

import java.util.Scanner;

class AA {
	int a;

	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		a = sc.nextInt();
	}
}

class BB extends AA {
	int b;

	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2nd No");
		b = sc.nextInt();
	}
}

class C extends BB {
	public void add() {
		System.out.println("Addition= " + (a + b));
	}
}

public class AddMultiInheritance {
	public static void main(String args[]) {
		C obj = new C();
		obj.input1();
		obj.input2();
		obj.add();
	}
}
