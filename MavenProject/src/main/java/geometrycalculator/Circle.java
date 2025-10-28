package geometrycalculator;

public class Circle extends Shape {
	
	@Override
	public void area() {
		int radius = 5;
		float pi = 3.14f;
		System.out.println("Area of the circle:"+pi*radius*radius);
		
	}
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.area();

	}

}
