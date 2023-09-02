package Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SquareOfNo {
       public static void main(String args[]) {
    	   
    	   List<Integer> list=Arrays.asList(12,5,3,10,15,6,10,13);
    	   
    	   System.out.println("Square of no:");
    	   for(Integer a:list) {
    		   System.out.println(a*a);
    	   }
       }
}
