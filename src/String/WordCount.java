package String;
import java.util.Scanner;
public class WordCount {
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter a String");
    	   String str=sc.nextLine();
    	   str=str.trim();   //remove space
    	   int count=1;
    	   for(int i=0;i<str.length();i++) {
       		   if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') 
       		
       		   {
    			   count++;
    		   }
    	   }
    	   System.out.println("Total no of words in given string are : "+count);
       }
}