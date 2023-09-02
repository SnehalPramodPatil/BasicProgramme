package Abtraction;
import Inheritance.RBI;
abstract class Shape{
	public abstract void draw();
	
}
class Rectangular extends Shape{
	public void draw() {
		System.out.println("Drawing Rectangular");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
public class Test {
	public static void main(String args[]) {
   	 Shape s1=new Rectangular();
   	 s1.draw();
   	Shape s2= new Circle();
   	 s2.draw();
   	 
//   	 RBI b=new RBI();
//	 b.getRateOfInterest();
//	 System.out.println(b.getRateOfInterest());
}
}