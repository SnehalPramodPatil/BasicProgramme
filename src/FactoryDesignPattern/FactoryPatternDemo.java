package FactoryDesignPattern;

import java.util.Scanner;

public class FactoryPatternDemo {
       public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Shape which you want to draw");
		String input=sc.next();
//		Shape s1=null;
//		
//		if(input.equalsIgnoreCase("Circle")) {
//			s1=ShapeFactory.getShape(input);
//			
//		}else if(input.equalsIgnoreCase("Rectangular")) {
//			s1=ShapeFactory.getShape(input);
//			
//		}else if(input.equalsIgnoreCase("Square")) {
//			s1=ShapeFactory.getShape(input);
//			
//		}else {
//			System.out.println("Invalid Input");
//		}
//		
//		if(s1!=null) {
//			s1.draw();
//		}
		
		Shape s1=ShapeFactory.getShape(input);
		s1.draw();
	}	
}

