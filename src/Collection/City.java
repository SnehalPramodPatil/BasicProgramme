package Collection;
import java.util.ArrayList;
public class City {
      public static void main(String args[]) {
    	  
    	  ArrayList<String> list=new ArrayList<String>();
    	  
    	  list.add("Pune");
    	  list.add("Sangli");
    	  list.add("Nashik");
    	  list.add("Nagpur");
    	  list.add("Mumbai");
    	  
    	  System.out.println(list);
    	  System.out.println(list.size());
    	  
    	  
    	  for(String city:list) {
    		  if(city.startsWith("S")) {
    			  System.out.println(city);
    		  }
    	  }
    	  System.out.println("**************");
    	  for(String city:list) {
    		  if(city.length()<=5) {
    			  System.out.println(city);
    		  }
    	  }
      }
}
