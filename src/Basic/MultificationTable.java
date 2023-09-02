package Basic;
import java.util.*;
public class MultificationTable {
        public static void main(String args[]) {
        	Scanner in=new Scanner(System.in);
        	int n;
        	System.out.println("Enter any Number");
        	n=in.nextInt();
        	
            for(int i=1; i<=10; i++)
        	{
            	System.out.println(n*i);
            	//System.out.println(n+"*"+i+"="+n*i);
        	}
        	
        }
}
