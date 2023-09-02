package Interface;
interface Animal{
	public void eat();
	public void travel();
}
class tiger implements Animal{
	public void eat() {
		System.out.println("Tiger Eats");
	}
	public void travel() {
		System.out.println("Tiger Travels");
	}
}
public class AnimalInterface {
     public static void main(String args[]) {
    	 Animal a=new tiger();     //upcasting
    	 a.eat();
    	 a.travel();     
     }
}
