package Method;

public class MathCalculation {
	public static void calculation(int a,int b) {
 	   int Sum,Subtraction,Multification,Division,Remainder;
 	   Sum=a+b;
 	   Subtraction=a-b;
 	   Multification=a*b;
 	   Division=a/b;       //quotient
 	   Remainder=a%b;
 	  
 	   System.out.println("Sum of two no is="+Sum);
 	   System.out.println("Subtraction of two no is="+Subtraction);
 	   System.out.println("Mutification of two no is="+Multification);
 	   System.out.println("Division of two no is="+Division);
 	   System.out.println("Remainder of two no is="+Remainder);
 	 
  }
    public static void main(String args[]) {
 	   MathCalculation obj=new MathCalculation();
 	   obj.calculation(100,20);
    }
}
