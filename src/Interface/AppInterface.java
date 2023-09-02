package Interface;

public class AppInterface {
	  public static void main(String args[]) {
   	   Area a1=new rectangular();
   	   System.out.println("Area of Rectangular: "+a1.calculate(1,50)); 
   	   
   	   Area a2=new circle();
   	   System.out.println("Area of circle: "+a2.calculate(50, 0));
      }
}


