package Basic;

public class PrimeNo {
       public static void main(String args[]) {
    	   int a=12;
    	   int c=0;
    	   for(int i=1;i<=a;i++) 
    	   {
    		  if(a%i==0)
    			c++;
    	   }
    		  if(c==2)
    		  {
    			  System.out.println(a+" is a Prime No");
    		  }else
    		  {
    			  System.out.println(a+" is not a Prime No");
    		  }
    	   
    	     
       }
}
