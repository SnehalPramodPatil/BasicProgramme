package Basic;

public class PerfectNo {
      public static void main(String args[]) {
    	  int n=28,sum=0;
    	  for(int i=1;i<n;i++)
    	  {
    		  if(n%i==0)
    		  {
    			  sum=sum+i;
    		  }
    	  }
    	  if(n==sum) 
    	  {
    		  System.out.println(n+" "+"is a Perfect No");
    	  }else
    	  {
    		  System.out.println(n+" "+"is not a Perfect No");
    	  }
      }
}
