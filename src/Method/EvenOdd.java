package Method;

public class EvenOdd {
	 public void checkEvenNo(int n) {
    	 for(int i=1;i<=n;i++)
    	 {
    		 if(i%2==0)
    		 {
    			 System.out.println(i);
    		 }
    	 }
     }
      public void checkOddNo(int n) {
    	  for(int i=1;i<=n;i++) {
    		  if(i%2!=0) {
    			  System.out.println(i);  
    		  }
    	  }
      }
     public static void main(String args[]) {
    	    EvenOdd obj=new EvenOdd();
    	    obj.checkEvenNo(20);
    	    obj.checkOddNo(10);
     }
}
