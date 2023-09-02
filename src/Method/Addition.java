package Method;

import java.util.Scanner;

public class Addition {
	int a,b;
	int sum;
	public void add(int a,int b)
	{
		sum = a + b;
		System.out.println("Addition of two no is="+sum);
	}

		public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no");
		int a = sc.nextInt();
		System.out.println("Enter 2nd no");
		int b = sc.nextInt();
		Addition a1 = new Addition();
		a1.add(a,b);
	

	}	
}
