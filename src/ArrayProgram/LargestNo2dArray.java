package ArrayProgram;

public class LargestNo2dArray {
      public static void main(String args[]) {
    	  int arr[][]= {{2,5},{9,10}};
    	  int largest=arr[0][0];
    	  
    	  for(int i=0;i<arr.length;i++) {
    		  for(int j=0;j<arr.length;j++) {
    			  if(arr[i][j]>largest) {
    				  largest=arr[i][j];
    			  }
    		  }
    	  }
    	  System.out.println("largest no: "+largest);
      }
}
