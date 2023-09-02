package Interface;

interface Vehical{
	void key();
	void wheel();	
}

class Car implements Vehical{
	public void key() {
		System.out.println("Car starts with key");
	}
	public void wheel() {
		System.out.println("Car has 4 wheels");
	}
}

class Bike implements Vehical{
	public void key() {
		System.out.println("Bike starts with button");
	}
	public void wheel() {
		System.out.println("Bike has 2 wheels");
	}
}
public class VehicalExample {
     public static void main(String args[]) {
    	 Vehical v1=new Car();
    	 v1.key();
    	 v1.wheel();
    	 v1=new Bike();
    	 v1.key();
    	 v1.wheel();
     }
}
