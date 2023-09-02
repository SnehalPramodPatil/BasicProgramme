package MethodOverriding;

class RBIBank {
    public float getRateOfInterest() {
    	return 4.5f;
    }
}
class SBI extends RBIBank{
	public float getRateOfInterest() {
		return 6.9f;
	}
}
class ICICI extends RBIBank {
	public float getRateOfInterest() {
		return 8.2f;
	}
}
public class Bank{
	public static void main(String args[]) {
		SBI s1=new SBI();
		System.out.println("Rate Of Interest: "+s1.getRateOfInterest()+"%");
		ICICI i1=new ICICI();
		System.out.println("Rate of Interest: "+i1.getRateOfInterest()+"%");
	}
}
