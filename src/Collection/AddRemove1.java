package Collection;
import java.util.ArrayList;
public class AddRemove1 {
        public static void main(String args[]) {
        	
        	ArrayList<Integer> list= new ArrayList<Integer>();
        	list.add(10);
        	list.add(20);
        	list.add(30);
        	list.add(40);
        	list.add(50);
        	
        	for(Integer a:list) {
        		System.out.println(a);
        	}
        	
        	Integer no=40;
        	list.remove(no);
        	System.out.println("After removing: "+list);
        	
        }
}
