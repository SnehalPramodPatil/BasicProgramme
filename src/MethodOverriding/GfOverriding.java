package MethodOverriding;

public class GfOverriding {
	public static void main(String args[]) {
		Son s1=new Son();
		s1.swim();
		Father f1=new Father();
		f1.swim();
	    GrandFather g1=new GrandFather();
		g1.swim();
//	    GrandFather g1=new Father();
//		g1.swim();
//		g1=new Son();
//		g1.swim();
	}
    
     
}
