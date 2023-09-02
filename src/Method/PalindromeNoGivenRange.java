package Method;

import java.util.Scanner;
public class PalindromeNoGivenRange {
	 void palindromeNo(int n1,int n2) {
		 int count=0;
  	   for(int i=n1;i<=n2;i++)
  	   {
  		   int rem,rev=0;
  		   int n=i;
  		   while(n>0)
  		   {
  			  rem=n%10;
  			  rev=rev*10+rem;
  			  n=n/10;
  		   }
  		   if(rev==i)
  		   {
  			   count++;
  			   System.out.println(i);
  		   }
  	   }
  	   System.out.println("Palindrome no present in that range is="+count);
     }
     
     public static void main(String args[]) {
  	   Scanner sc=new Scanner(System.in);
  	   System.out.println("Enter the range");
  	   int n1=sc.nextInt();
  	   int n2=sc.nextInt();
  	   System.out.println("Palindrome no in the given range are");
  	   PalindromeNoGivenRange obj=new PalindromeNoGivenRange();
  	   obj.palindromeNo(n1,n2);
}	   
}
