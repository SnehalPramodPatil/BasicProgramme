package Collection;
import java.util.ArrayList;
public class AddRemove {
       public static void main(String args[]) {
    	   
    	   ArrayList<Integer> list=new ArrayList<>();
    	   
    	   list.add(10);
    	   list.add(20);
    	   list.add(30);
    	   list.add(40);
    	   list.add(50);
    	   list.add(20);
    	   System.out.println(list);
    	   System.out.println("Size of array: "+list.size());
    	   list.remove(2);
    	   System.out.println("After remove using index: "+list);
    	   
//    	   Integer no=20;
//    	   list.remove(no);
//    	   System.out.println("After remove: "+list);
//    	   
       }
}
