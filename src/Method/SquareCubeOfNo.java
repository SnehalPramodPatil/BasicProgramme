package Method;

import java.util.Scanner;

public class SquareCubeOfNo {
	void square(int n) 
	{
  	  int sq=n*n;
  	  System.out.println("Square of given no "+sq);
	}
	
	void Cube(int n)
	{
		int cube=n*n*n;
		 System.out.println("Cube of given no "+cube);
	}
	
     public static void main(String args[]) {
  	   Scanner sc=new Scanner(System.in);
  	   System.out.println("Enter Number ");
  	   int  n=sc.nextInt();
  	   SquareCubeOfNo obj=new SquareCubeOfNo();
  	   obj.square(n);
  	   obj.Cube(n);
     }
}
