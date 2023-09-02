package Java8Feature;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(12,6,8,45,36,78,21,11,5);
		//Collections.sort(list);
		//System.out.println("Sorted List: "+list);
		
		list.stream().sorted().toList().forEach(e->System.out.print(e+","));
		
		//System.out.println(list.stream().filter(e->e%2==0).toList());
		List<Integer>evenNo=list.stream().filter(e->e%2==0).toList();
		   System.out.println("Even no from list are: "+evenNo);
		
		List<Integer>number=list.stream().filter(e->e%2==0 && e>50).toList();
		    System.out.println("Element greater than 50: "+number);
		    
		List<Integer>number1=list.stream().filter(e->e%2==0).filter(e->e<50).toList();
		    System.out.println("Element less than 50: "+number1);
		    
		List<Integer>Square=list.stream().map(e->e*e).collect(Collectors.toList());
		//List<Integer>Square=list.stream().map(e->e*e).toList();
		System.out.println(Square);
		
		list.stream().filter(e->e%2!=0).map(e->e*e).forEach(e->System.out.println(e));
	}
 
}
 