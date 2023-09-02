package MethodOverloading;

public class PatternOverloading {
	public void display() {
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
	}
	
	public void display(String symbol) {
		for(int i=1;i<=10;i++) {
			System.out.print(symbol);
		}
	}
}
