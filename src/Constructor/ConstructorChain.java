package Constructor;
class Parent{
	Parent()
	{
		System.out.println("Im in Parent class constructor");
	}
	Parent(int a)
	{
		this();
		System.out.println("Im in Parent class parameterised constructor");
	}
}
class Child extends Parent{
	Child()
	{
        super(10);
		System.out.println("Default constructor");
	}
	Child(String name)
	{
       this();
		System.out.println("Im in child class constructor");
		
	}
}
public class ConstructorChain {
       public static void main(String args[]) {
    	   Child c=new Child("abs");
    	  
       }
}
