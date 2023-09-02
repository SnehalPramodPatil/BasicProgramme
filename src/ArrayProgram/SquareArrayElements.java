package ArrayProgram;

public class SquareArrayElements {
	 public static void main(String args[]) {
       int arr[]= {5,8,3,4,10,15};
       int sq=0;
       for(int i=0;i<arr.length;i++) {
    	   sq=arr[i]*arr[i];
    	   System.out.println("Sq of " +arr[i] + " is " +sq);
       }
      
	 }
}