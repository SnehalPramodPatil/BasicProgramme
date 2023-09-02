package Constructor;
class A{
	A()
	{
		System.out.println("A");
	}
	
	A(String str)
	{
		this();
		System.out.println(str);
	}
}
class B extends A{
	B()
	{
		super("abs");
		System.out.println("B");
	}
}
class C extends B{
	C()
	{
	
		System.out.println("C");
	}
	C(int max)
	{
		this();
		System.out.println("Number:"+max);
	}
}
public class ConstructorChain1 {
       public static void main(String args[]) {
    	   C c1=new C(30);
       }
}
