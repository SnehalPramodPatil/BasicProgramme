package Interface;
interface A{
	int a=60;int b=12;
	void add();
	void sub();
}
interface B{
	void mul();
	void div();
	
}
class C implements A,B{
	public void add() {
		System.out.println("Addition of two no: "+(a+b));
	}
	public void sub() {
		System.out.println("Subtraction of two no: "+(a-b));
	}
	public void mul() {
		System.out.println("Multification of two no: "+(a*b));
	}
	public void div() {
		System.out.println("Division of two no: "+(a/b));
	}
	
}
public class CalculatorDemo {
       public static void main(String args[]) {
    	   C obj=new C();
    	   obj.add();
    	   obj.sub();
    	   obj.mul();
    	   obj.div();
       }
}
