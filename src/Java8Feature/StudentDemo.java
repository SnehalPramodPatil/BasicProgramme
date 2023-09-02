package Java8Feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {
     public static void main(String[] args) {
    	 
//	      List<Student>list=Arrays.asList(new Student(101,"Pramod",30),new Student(102,"Snehal",20),new Student(103,"Pranal",5));
//	      
//	      System.out.println(list.stream().filter(e->e.age<10).collect(Collectors.toList()));
//	      System.out.println(list);
//	      
	      Student s1=new Student(10,"sejal",35);
	      Student s2=new Student(11,"Ved",20);
	      Student s3=new Student(12,"piyush",48);
	      
	      List<Student>student=new ArrayList<>();
	      student.add(s1);
	      student.add(s2);
	      student.add(s3);
	      
	      System.out.println(student);
  }
}
