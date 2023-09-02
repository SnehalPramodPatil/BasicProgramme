package ArrayProgram;
import java.util.Scanner;
public class MatrixDeterminant {
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	int [][] a=new int[2][2];
        	int determinant=0;
        	
        	System.out.println("enter the elements of array");
        	for(int i=0;i<2;i++) {
        		for(int j=0;j<2;j++) {
        			a[i][j]=sc.nextInt();
        		}
        	}
        	determinant=(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
        	System.out.println("Determinant: "+determinant
        			);
        }
}
