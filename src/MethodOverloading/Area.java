package MethodOverloading;

public class Area {
	float area;
        void area() {
        	int l=10;int b=20;
           area=l*b;
        	System.out.println("Area of rectangular: "+area);
        }
        void area(float a) {
        	float pi=3.14f;
        	//float r=10;
        	 area=pi*a*a;
        	 System.out.println("Area of Cicle: "+area);
        }
}
