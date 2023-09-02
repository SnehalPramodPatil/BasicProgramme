package String;
import java.util.Scanner;
public class LongesWord {
      public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Sentences");
    	 String str=sc.nextLine();
    	 int max=0,count=0;
    	 str=str+" ";
    	 for(int i=0;i<str.length();i++)
    	 {
    		 if(str.charAt(i)!=' ')
    		 {
    			
    			 count++;
    		 }
    		 else
    		 {  
    			 if(count>max) {
    				 max=count;
    			 }
    			 
    			 count=0;
    		 }
    	 }
    	 System.out.println("Number of characters in the Longest Word is: "+max);
    	 
      }
}
