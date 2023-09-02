package Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class ReverseArrayList {
      public static void main(String args[]) {
    	  
    	  List<String> list=new ArrayList<>();
    	  
    	  list.add("Pune");
    	  list.add("Sangli");
    	  list.add("Nashik");
    	  list.add("Nagpur");
    	  list.add("Mumbai");
    	  
//    	  List<String> ReverseList=new ArrayList<>();
//    	  
//    	  for(int i=list.size()-1; i>=0;i--) {
//    		  String str=list.get(i);
//    		  ReverseList.add(str);
//    	  }
//    	  System.out.println("Before Reverse: "+list);
//    	  System.out.println("After Reverse: "+ReverseList);
    	  Collections.reverse(list);
    	  System.out.println(list);
      }
}