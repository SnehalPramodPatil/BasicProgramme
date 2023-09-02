
package Basic;
import java.util.Scanner;
public class Calculator {
      public static void main(String args[]) {
    	  Scanner sc=new Scanner(System.in);
    	  char operator;
    	  double No1,No2,result;
    	  System.out.println("Select Operator : +, -, *, /");
    	  operator=sc.next().charAt(0);
    	  System.out.println("Enter 1st no");
    	  No1=sc.nextDouble();
    	  System.out.println("Enter 2nd no");
    	  No2=sc.nextDouble();
    	  
    	  switch(operator) {
    	  case '+':
    		  result=No1+No2;
    		  System.out.println("Addition of two no is= "+result);
    		  break;
    	  case '-':
    		  result=No1-No2;
    		  System.out.println("Subtraction of two no is= "+result);
    		  break;
    	  case '*':
    		  result=No1*No2;
    		  System.out.println("Multification of two no is= "+result);
    		  break;
    	  case '/':
    		  result=No1/No2;
    		  System.out.println("Division of two no is= "+result);
    		  break;
    	   default:
    		   System.out.println("Invalid Operator");
    	  }
    	  
    	  
      }
}
