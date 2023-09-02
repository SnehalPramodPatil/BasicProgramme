package User;
import java.util.Map;
import java.util.HashMap;
public class CharOccurance {
public static  void getCharOccurance(String str) {
	
	Map<Character,Integer> map=new HashMap<>();
	char[] chars=str.toCharArray();
	for(char ch:chars) {
//		if(map.containsKey(ch)) {
//			map.put(ch,map.get(ch)+1);
//		}else
//		{
//			map.put(ch,1);
//		}
		if(!map.containsKey(ch)) {
			map.put(ch,1);
		}else
		{
			int count=map.get(ch);
			map.put(ch,count+1);
		}
	}
	System.out.println(map);
}
public static void main(String args[]) {
       getCharOccurance("Programming");
}
}
