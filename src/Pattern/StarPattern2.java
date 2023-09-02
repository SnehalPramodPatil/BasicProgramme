package Pattern;

import java.util.Scanner;
public class StarPattern2 {
	 public static void main(String args[]) {
   	  Scanner sc=new Scanner(System.in);
   	  int n=sc.nextInt();
   	 // for(int i=1;i<=n;i++)          //row
   		  for(int i=n;i>=1;i--) 
   	  {
   		  for(int j=1;j<=(n-i);j++)    //space print
   		  {
   			  System.out.print(" ");
   		  }
   		  for(int j=1;j<=i;j++)      //star print
   		  {  
   		         System.out.print("*");
   		       //  System.out.print("*"+" ");
   		  } 
   		           System.out.println();
   	  }
  }
}
