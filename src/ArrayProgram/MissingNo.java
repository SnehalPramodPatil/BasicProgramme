package ArrayProgram;

public class MissingNo {
      public static void main(String args[]) {
    	  int[] a= {1,2,4,9,6,8,3,5};
    	  int n=a.length+1;
    	  int sum=0;
    	  int arrSum=0;
    	  
    	  for(int i=1;i<=n;i++) {
    		  sum=sum+i;
    	  }
    	  
    	  for(int i=0;i<a.length;i++) {
    		  arrSum=arrSum+a[i];
    	  }
    	  System.out.println("Missing no is: "+(sum-arrSum));
      }
}
