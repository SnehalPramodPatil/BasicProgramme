package Constructor;
import java.util.Scanner;
public class AreaOfTriangle {
        long area;
        AreaOfTriangle(long b,long h)
        {
        	 area=(b*h)/2;
        	//System.out.println("Area of Triangle: "+area);
        }
        
         public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter width of Triangle");
        	long b=sc.nextLong();
        	System.out.println("Enter height of Triangle");
        	long h=sc.nextLong();
        	
        	AreaOfTriangle a=new AreaOfTriangle(b,h);
        	System.out.println("Area of Triangle: "+a.area);
        }
}
