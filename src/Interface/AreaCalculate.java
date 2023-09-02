package Interface;


interface Area{
	final static float pi=3.14f;
     float calculate(float a,float b);
	
}
class rectangular implements Area{
	public float calculate(float a,float b) {
		return a*b;
	}
}
class circle implements Area{
	public float calculate(float a,float b) {
		return pi*a*a;
	}
}
public class AreaCalculate {
	 public static void main(String args[]) {
         Area a1= new rectangular();
  	  System.out.println("Area of Rectangular: "+a1.calculate(10,20));
  	  
  	  Area a2=new circle();
  	  System.out.println("Area of Circle: "+a2.calculate(10,0));
    }
}
