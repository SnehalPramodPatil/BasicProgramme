package Method;

import java.util.Scanner;
public class PalindromeNo {
	public void checkPalindrome(int n) {
  	  int rem,rev=0;
  	  int orignal=n;
  	  while(n>0) {
  		  rem=n%10;
  		  rev=rev*10+rem;
  		  n=n/10;
  	 }
  	  if(rev==orignal)
  	  {
  		  System.out.println(orignal+" "+"is a Palindrome No");
  	  }else
  	  {
  		  System.out.println(orignal+" "+"is not a Palindrome No");
  	  }
    }
    public static void main(String args[]) {
  	  Scanner sc=new Scanner(System.in);
  	  int n=sc.nextInt();
  	  PalindromeNo p1=new PalindromeNo();
  	  p1.checkPalindrome(n);
    }

}
