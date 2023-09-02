package Method;

import java.util.Scanner;
public class PalindromeString {
	void checkPalindromeString(String str1) {
	    String str2="";
	   int l=str1.length();
	   for(int i=l-1;i>=0;i--)
	   {
		   str2=str2+str1.charAt(i);
	   }
	   if(str1.equals(str2))
	   {
		   System.out.println(str1+" "+"is a Palindrome");
	   }else
	   {
		   System.out.println(str1+" "+"is not a Palindrome");  
	   }
   }
   public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String str1=sc.next();
	  PalindromeString obj=new PalindromeString();
	  obj.checkPalindromeString(str1);
   }
}
