package Basic;

public class Student {
      int id; String name;
      
      Student(int id,String name)
      {
    	  this.id=id;
    	  this.name=name;
      }
      
      Student()
      {
    	  System.out.println("Default Constructor");
      }
      
      void display() {
    	  System.out.println("name="+name+" "+"id="+id);
      }
      
      public static void main(String args[]) {
    	  Student s1=new Student(125,"snehal");
    	  s1.display();
    	  Student s2=new Student();
   
      }
}
