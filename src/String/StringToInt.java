package String;
import java.util.Scanner;
public class StringToInt {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.println("Enter String");
    	  String str=sc.next();
    	  int no1=Integer.parseInt(str);    //convert string to int
  
    	  System.out.println("Integer No: "+str);
    	  System.out.println(str+100);
    	  System.out.println(no1+300);
    	  
    	  String s1=String.valueOf(no1);   //int to string
    	  System.out.println(s1+50);
      }
}
