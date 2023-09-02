package String;
import java.util.Scanner;
public class ReplaceFirstCharOccur {
       public static void main(String args[]) {
    	   Scanner sc=new Scanner(System.in);
    	   System.out.println("Enter string");
    	   String str=sc.nextLine();
    	   System.out.println("Enter character to replace");
    	   char replaceCh=sc.next().charAt(0);
    	   System.out.println("Enter new character");
    	   char newCh=sc.next().charAt(0);
    	   
    	   char[]array=str.toCharArray();
    	   for(int i=0;i<array.length;i++) {
    		   if(array[i]==replaceCh) {
    			   array[i]=newCh;
    			   break;
    		   }
    	   }
    	   System.out.println("Final String after replacing: "+array);
       }
}
