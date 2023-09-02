package Inheritance;
class Bicycle{
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
	}
}
class MountainBike extends Bicycle{
	public int seatHeight;
	public MountainBike(int gear,int speed,int seatHeight) {
		super(gear,speed);
	    
		this.seatHeight=seatHeight;
	}
}

public class TestBicycle {
        public static void main(String args[]) {
        	MountainBike b1=new MountainBike(4,50,6);
        	System.out.println("No of gears are: "+b1.gear+" "+"Speed of bicycle is: "+b1.speed+ " "+"Seat Height is: "+b1.seatHeight);
    }
}
