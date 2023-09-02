package Java8Feature;

import java.util.ArrayList;
import java.util.List;

public class PrintCity {
      public static void main(String[] args) {
		
    	  List<String> city=new ArrayList<>();
    	  
    	  city.add("Banglore");
    	  city.add("Pune");
    	  city.add("Mumbai");
    	  city.add("Nashik");
    	  
    	  city.stream().filter(c->c.startsWith("B")).forEach(c->System.out.println(c));
    	  
	}
}
