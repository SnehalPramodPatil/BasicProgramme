package Collection;
import java.util.ArrayList;
public class ConcurrentException {
     public static void main(String args[]) {
    	 
    	 ArrayList<Integer> list=new ArrayList<>();
    	 
    	 list.add(10);
    	 list.add(25);
    	 list.add(45);
    	 list.add(78);
    	 list.add(45);
    	 
    	 for(Integer a:list) {
    		 if(a%2==0) {
    			 list.remove(a);
    		 }
    	 }
     }
}
