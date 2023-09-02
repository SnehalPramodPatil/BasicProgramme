package ArrayProgram;

public class PrintElements {
          public static void main(String args[]) {
        	  int sum=0;
        	  int[] a= {10,20,30,40,50};
        	  System.out.println("Array Elements:");
        	  for(int i=0;i<a.length;i++) {
        		  System.out.print(a[i]+" ");
        		  sum=sum+a[i];
        		
        	  }
        	  System.out.println();
        	  System.out.println("sum of array is "+sum);
        	  
        	  System.out.println("Array reverse Elements:");
        	  for(int i=a.length-1;i>=0;i--) {
        		  System.out.print(a[i]+" ");
        	  }
        	  System.out.println();
        	  System.out.println("Total no of elements in array: "+a.length);
        
        	  System.out.print("Elements at even index:");
        	  for(int i=0;i<a.length;i++) {
        		  if(i%2==0)
        		  System.out.print(a[i]+" ");
        	  }
        	  
        	  System.out.println();
        	  
        	  System.out.print("Elements at odd index:");
        	  for(int i=0;i<a.length;i++) {
        		  if(i%2!=0)
        		  System.out.print(a[i]+" ");
        	  }
          }
}
