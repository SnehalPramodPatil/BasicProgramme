package Method;

import java.util.Scanner;
public class StringEquality {
	public void checkStringEqual(String str1,String str2) {
  	  if(str1.equalsIgnoreCase(str2))
  	      {
  		  System.out.println("Both are Equal");
  		  }else
  		  {
  		   System.out.println("Both are not Equal");
  		  }
    }
    public static void main(String args[]) {
  	  Scanner sc=new Scanner(System.in);
  	  System.out.println("Enter the String");
  	  String str1=sc.next();
  	  String str2=sc.next();
  	  StringEquality s1=new StringEquality();
  	  s1.checkStringEqual(str1,str2);
    }
}
