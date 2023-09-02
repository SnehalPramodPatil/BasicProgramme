package Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class RemoveEvenNo {
       public static void main(String args[]) {
    	   
    	   ArrayList<Integer> list=new ArrayList<>();
    	   
    	   list.add(20);
    	   list.add(40);
    	   list.add(15);
    	   list.add(23);
    	   list.add(32);
    	   list.add(3);
    	   list.add(40);
    	   
    	   System.out.println("Before remove: "+list);
    	   Iterator<Integer> itr=list.iterator();
    	   
    	    while(itr.hasNext()) {
    	    	
    	    	Integer no=itr.next();
    	    	
    	    	if(no%2==0) {
    	    		itr.remove();
    	    	}
    	    	
    	    }
    	    System.out.println("After remove: "+list);
       }
}
