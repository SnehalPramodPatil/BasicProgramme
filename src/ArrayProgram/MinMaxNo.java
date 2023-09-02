package ArrayProgram;

public class MinMaxNo {
      public static void main(String args[]) {
    	  int[] a= {10,54,58,6,1,95};
    	  int min=a[0];
    	  int max=a[0];
    	  
    	  for(int i=1;i<a.length;i++) {
    		  if(max<a[i]) {
    			  max=a[i];
    		  }
    	  }
    	  System.out.println("Maximum no is: "+max);
    	  
    	  
    	  for(int i=1;i<a.length;i++) {
    		  if(min>a[i]) {
    			  min=a[i];
    		  }
    	  }
    	  System.out.println("Minimum no is: "+min);
      }
}
