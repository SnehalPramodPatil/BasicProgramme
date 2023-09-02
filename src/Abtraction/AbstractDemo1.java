package Abtraction;


abstract class A {
	public static void fun() {
		System.out.println("Static Method Implemented");
	}

	abstract void function();

}

class B extends A {
	void function() {
		System.out.println("Abstract Method Implemented");
	}

}
public class AbstractDemo1 {
	public static void main(String args[]) {
		B b = new B();
		b.function();
		//b.fun();
		 A.fun(); // static method no need to create an object
	}
}
