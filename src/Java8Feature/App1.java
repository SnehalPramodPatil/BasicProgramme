package Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App1 {
      public static void main(String[] args) {
		List<String> cities=Arrays.asList("Pune","Nashik","Mumbai","Sangli","Satara");
		
		System.out.println(cities.stream().filter(e->e.startsWith("S")).toList());
		
		System.out.println(cities.stream().filter(e->e.startsWith("P")).collect(Collectors.toList()));
		
		cities.stream().filter(e->e.length()>5).forEach(e->System.out.println(e));
	}
}
