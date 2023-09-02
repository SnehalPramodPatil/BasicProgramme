package MethodOverriding;

public class GrandFather {

	public void swim() {
		System.out.println("GrandFather Swimming in River");
	}
}

class Father extends GrandFather {
	public void swim() {
		System.out.println("Father Swimming in well");
	}
}

class Son extends Father {
	public void swim() {
		System.out.println("Son Swimming in Pool");
	}
}
