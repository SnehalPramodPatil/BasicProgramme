package ArrayProgram;

public class Multification {
       public static void main(String args[]) {
    	   int[][] a= {{0,1,2},{3,2,5},{4,3,1}};
    	   int[][] b= {{1,6,3},{2,3,4},{2,1,3}};
    	      	   
    	   int[][] c=new int[3][3];
    	   System.out.println("Multification of two matrix is:");
    	   for(int i=0;i<3;i++) {
    		   for(int j=0;j<3;j++) {
    			   for(int k=0;k<3;k++) {
    				   c[i][j]=c[i][j]+a[i][k]*b[k][j];
    			   }
    			   System.out.print(c[i][j]+" ");
    		   }
    		   System.out.println(" ");
    	   }
       }
}
