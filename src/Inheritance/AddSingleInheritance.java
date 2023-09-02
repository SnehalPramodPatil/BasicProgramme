package Inheritance;
import java.util.Scanner;

class A {
	int a, b;

	public void input1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No");
		a = sc.nextInt();
		System.out.println("Enter 2nd No");
		b = sc.nextInt();
	}

	public  void add() {
		System.out.println("Addtion of two no+ " + (a + b));
	}
}

class B extends A {
	int c;

	public void input2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3rd No");
		c = sc.nextInt();
	}

	public void display() {
		System.out.println("Addtion= " + (a + b +c));
	}
}

public class AddSingleInheritance {
	public static void main(String args[]) {
		B obj = new B();
		obj.input1();
		obj.input2();
		obj.display();
		// obj.add();
	}

}
