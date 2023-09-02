package Abtraction;


abstract class Bike{
	public Bike() {
		System.out.println("Bike is created");
	}
	public abstract void run();
	public abstract void changeGear();
}

class Honda extends Bike{
	public void run() {
		System.out.println("Running Safely");
	}
	public void changeGear() {
		System.out.println("Gear Changed");
	}
}
public class AbstractDemo {
	 public static void main(String args[]) {
  	   Bike b1=new Honda();
  	   b1.run();
  	   b1.changeGear();
     }
}
