package ExceptionHandling;

public class ExceptionPropagate {
       public void A() {
    	   int r=100/0;
    	   System.out.println("A");
       }
       
       public void B() {
    	   A();
    	   System.out.println("B");
       }
       
       public void C() {
    	   A();
    	   System.out.println("C");
       }
       
       public static void main(String args[]) {
    	   ExceptionPropagate e1=new ExceptionPropagate();
    	   try {
    		   e1.C();
    	   }catch(ArithmeticException e) {
    		   System.out.println(e.getMessage());
    	   }
    	   System.out.println("Program continue");
       }
 }
