package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {
       
	public void DupChar(String str) {
	   Map<Character, Integer> map=new HashMap<>();
	   char charArray[]=str.toCharArray();
	   for(Character ch:charArray) {
		   if(map.containsKey(ch)) {
			   map.put(ch, map.get(ch)+1);
		   }else {
			   map.put(ch, 1);
		   }
	   }
	   
	   Set<Character>keys=map.keySet();
	   for(Character ch:keys) {
		   if(map.get(ch)>1) {
			   System.out.println(ch +" is "+ map.get(ch)+ " times");
		   }
	   }
	}
	public static void main(String[] args) {
		DuplicateChar dup=new DuplicateChar();
		dup.DupChar("India is my country");
	}
}
