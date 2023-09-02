package User;
import java.util.*;
import java.util.HashMap;

public class Map {
	public static void main(String args[]) {
		 HashMap<String,Integer> map=new HashMap<>();
		 map.put("India",120);
		 map.put("china",150);
		 map.put("US",50);
		 map.put("Canada",100);
		 map.put("Bangladesh", 90);
		 System.out.println(map);
		 map.remove("Bangladesh");
		// map.replace("UK",70);
		 System.out.println("Updated list: "+map);
		 
		 System.out.println("iterating hashmap");
		 for(HashMap.Entry m:map.entrySet()) {
			 System.out.println("key: "+m.getKey()+" value: "+m.getValue());
		 }
		 
	}
}
