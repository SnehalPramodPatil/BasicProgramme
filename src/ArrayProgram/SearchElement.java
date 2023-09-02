package ArrayProgram;
import java.util.Scanner;
public class SearchElement {
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	int i;
        	System.out.println("Enter array size");
        	int n=sc.nextInt();
        	int[] a=new int[n];
        	System.out.println("Enter array element");
        	for(i=0;i<a.length;i++) {
        		a[i]=sc.nextInt();
        	}
        	System.out.println("Entetr Search element");
        	int searchElement=sc.nextInt();
        	int count=0;
        	for(i=0;i<a.length;i++) 
        	{
        		if(a[i]==searchElement)
        		{
        			count++;
        			System.out.println("No found "+count+" "+"times");
            		System.out.println("No found at index: "+i);
                    
            	}
        	}
        	if(count==0)
        	{
        	 System.out.println("No is not found anywhere");
        	}
        	
        }
}
     //best case time complexity  O(1)
     //Avg case time complexity   O(log n)
     //worst case time complexity  O(n)