package Constructor;

public class Default {
     int roll;String name;
    
     void display() {
    	 System.out.println("Name:"+name+" "+"RollNo:"+roll);
     }
	
	public static void main(String args[]) {
		Default d1=new Default();
		d1.display();
	}
}
