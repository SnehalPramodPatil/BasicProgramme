package ArrayProgram;

public class FindTwoDigitNo {
      public static void main(String args[]) {
    	  int[] a=new int[] {4,6,12,78,24,2,121,0,7};
    	  System.out.println("Two digit Nos are");
    	  for(int i=0;i<a.length;i++) {
    		  if(a[i]>9 && a[i]<100) {
    			  System.out.println(a[i]);
    		  }
    	  }
      }
}
