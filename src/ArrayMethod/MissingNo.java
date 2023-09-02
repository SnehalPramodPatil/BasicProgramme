package ArrayMethod;

public class MissingNo {
      public static void findMissingNo(int[]a) {
    	  int sum=(10*11)/2;
    	  int arrSum=0;
    	  for(int i=0;i<a.length;i++) {
    		  arrSum=arrSum+a[i];
    	  }
    	  System.out.println(sum-arrSum);
      }
	
	
	
	public static void main(String args[]) {
		int a[]= {1,2,3,5,6,7,8,9,10};
		findMissingNo(a);
	}
}
