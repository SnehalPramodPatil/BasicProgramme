package FactoryDesignPattern;

public class ShapeFactory {
	public static Shape getShape(String shapeType) {
		Shape s1 = null;

		if (shapeType.equalsIgnoreCase("Circle"))
			s1 = new Circle();

		if (shapeType.equalsIgnoreCase("Rectangular"))
			s1 = new Rectangular();

		if (shapeType.equalsIgnoreCase("Square"))
			s1 = new Square();
							
		return s1;
	}
}
