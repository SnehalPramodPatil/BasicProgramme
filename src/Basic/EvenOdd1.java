package Basic;

public class EvenOdd1 {
       public static void main(String args[]) {
    	   int n=10,sum=0,sum1=0;
    	     for(int i=1;i<=n;i++)
    	        {
    	    	
    		     if(i%2==0) 
    		        {
    		    	 sum=sum+i;
    			      System.out.println(i+" ");
    			    }
    	        }
    	         System.out.println("Sum of Even no is="+sum);
    	     
    	     for(int j=1;j<=n;j++) 
    	   {
     		   if(j%2!=0) 
     		   {
     			   sum1=sum1+j;
     			   System.out.println(j+" ");
     			   
     		   }
    	   }
    	       System.out.println("Sum of Odd no is= "+sum1);
       }
}
