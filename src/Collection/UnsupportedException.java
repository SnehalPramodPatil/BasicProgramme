package Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class UnsupportedException {
       public static void main(String args[]) {
    	   
    	   List<Integer> list=Arrays.asList(12,5,4,3,6,7,9,2);   //cant add item 
    	   list.add(5);
    	   
    	   System.out.println(list);
       }
}
