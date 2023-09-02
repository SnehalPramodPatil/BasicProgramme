package Collection;
import java.util.ArrayList;
public class EvenOdd {
     public static void main(String args[]) {
    	 
    	 ArrayList<Integer> list=new ArrayList<Integer>();
    	 
    	 list.add(10);
    	 list.add(12);
    	 list.add(15);
    	 list.add(20);
    	 list.add(25);
    	 list.add(16);
    	 list.add(5);
    	 
    	 System.out.println("Even no:");
    	 for(Integer a:list) {
    		 if(a%2==0) {
    			 System.out.println(a);
    			 
    		 }
    	 }
    	 
    	 System.out.println("Odd no:");
    	 for(Integer a:list) {
    		 if(a%2!=0) {
    			 System.out.println(a);
    		 }
    	 }
     }
}
