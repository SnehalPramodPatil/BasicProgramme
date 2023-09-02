package Basic;
import java.util.Scanner;

public class SumofGivenNo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		long no = sc.nextLong();
		long sum = 0, rem;

		while (no > 0) {
			rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		System.out.println("Sum of all the digits in given no is " + sum);
		
		//by convert long to string
		long no1=1245;
	
		String str=Long.toString(no1);
		System.out.println(str+no1);
		System.out.println("length: "+str.length());
		for(int i=0;i<str.length();i++) {
			str.charAt(i);
			System.out.println(str.charAt(i));
		}
		
	}
}
