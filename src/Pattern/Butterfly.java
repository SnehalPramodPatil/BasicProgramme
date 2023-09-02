package Pattern;

import java.util.Scanner;
public class Butterfly {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		   //upper half
		for(int i=1;i<=n;i++) 
		{
			//1st half
			for(int j=1;j<=i;j++)   //star print
			{
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++)   //space print
			{
				System.out.print(" ");
			}
			//2nd half
			for(int j=1;j<=i;j++)        //star print
			{
				System.out.print("*");
			}
			   System.out.println(" ");
		}
		   
		//lower half
		for(int i=n;i>=1;i--) 
		{
			//1st half
			for(int j=1;j<=i;j++)   //star print
			{
				System.out.print("*");
			}
			for(int j=1;j<=2*(n-i);j++)   //space print
			{
				System.out.print(" ");
			}
			//2nd half
			for(int j=1;j<=i;j++)      //star print
			{
				System.out.print("*");  
			}
			   System.out.println(" ");
		}
		
		
	}
}
