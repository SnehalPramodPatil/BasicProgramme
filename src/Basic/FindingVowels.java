package Basic;
import java.util.Scanner;
public class FindingVowels {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter a String");
    	  String str=sc.next();
    	  str=str.toLowerCase();
    	  for(int i=0;i<str.length();i++)
    	  {
    		  char ch=str.charAt(i);
    		  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    		  {
    			System.out.print(ch);
    		  }
    		   
    		  
    	  }
      }
}

