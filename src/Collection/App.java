package Collection;
import java.util.Set;
import java.util.HashSet;
public class App {
       public static void main(String args[]) {
    	   
    	   Set<Integer> s=new HashSet<>();
    	   
    	   s.add(23);
    	   s.add(12);
    	   s.add(45);
    	   s.add(89);
    	   s.add(23);
    	   
    	   System.out.println(s.size());
    	   System.out.println(s);
       }
}
