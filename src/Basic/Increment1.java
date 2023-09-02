package Basic;

public class Increment1 {
       public static void main(String args[]) {
    	   int a=40;
    	   int b=50;
    	   int c=0;
    	   c=a++ + ++b + ++a - ++b + a++;
    	   System.out.println(c);
       }
       
}
