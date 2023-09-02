package ExceptionHandling;

public class App {
	static void m1(String b) {
		try {
		int a=Integer.parseInt(b);
		a=a+10;
		System.out.println(a);
		}
		catch(NumberFormatException npe) {
			System.out.println("Invalid Integer");
		}
	}
	
      public static void main(String[] args) {
		m1("23");     // output 33
		m1("java");   //invalid
	}
}
