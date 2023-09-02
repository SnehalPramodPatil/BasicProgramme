package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate1 {
      public static void main(String[] args) {
		List<Integer> list=Arrays.asList(12,45,6,8,2,21,6,8,12,78,100);
		System.out.println("Before removing duplicate "+ list);
		
		Set<Integer> set=new HashSet<>();
		set.addAll(list);
		System.out.println("After removing duplicates "+set);
	}
}
