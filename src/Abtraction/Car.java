package Abtraction;

public abstract class Car {
        public abstract void key();
        
        public void wheel() {
        	System.out.println("car has 4 wheels");
        }
}

class Baleno extends Car{
	 public void key() {
		 System.out.println("Baleno start with key");
	 }
}

