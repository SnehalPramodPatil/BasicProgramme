package Basic;

public class GreaterOfThree {
       public static void main(String args[]) {
    	   int a=52;
    	   int b=46;
    	   int c=85;
    	   if(a>=b && a>=c)
    	   {
    		   System.out.println("Greater no is="+a);
    		   
    	   }else if(b>=c && b>=a)
    	   {
    		    System.out.println("Greater no is="+b);
    		    
    	   }else
    	   {
    		   System.out.println("Greater no is="+c);
    	   }
       }
}
