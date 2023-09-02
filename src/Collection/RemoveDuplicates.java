package Collection;
import java.util.ArrayList;
public class RemoveDuplicates {
      public static void main(String args[]) {
    	  
    	  ArrayList<Integer> list=new ArrayList<>();
    	  
    	  list.add(12);
    	  list.add(100);
    	  list.add(200);
    	  list.add(22);
    	  list.add(100);
    	  list.add(12);
    	  System.out.println("Before Removing Duplicate Element: "+list);
    	  
    	  for(int i=0;i<list.size();i++) {
    		  for(int j=i+1;j<list.size();j++) {
    			  if(list.get(i).equals(list.get(j))) {
    				  list.remove(j);
    				  j--;
    			  }
    		  }
    	  }
    	  System.out.println("After Removing Duplicate Element: "+list);
      }
}
