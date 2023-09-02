package Method;

import java.util.Scanner;
public class FactorialGivenRange {
	void factRange(int n1,int n2) {
		   for(int i=n1;i<=n2;i++)
		   {
			   int fact=1;
			   for(int j=1;j<=i;j++)
			   {
				   fact=fact*j;
			   }
			   System.out.println("Factorial of "+i+"="+fact);
		   }

	   }
	   public static void main(String args[]) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Range");
		   int n1=sc.nextInt();
		   int n2=sc.nextInt();
		   FactorialGivenRange f1=new FactorialGivenRange();
		   f1.factRange(n1,n2);
	   }
}
