package geometrycalculator;

public class Rectangle extends Shape {
	
	@Override
	public void area() {
		
		int length = 10;
		int breadth = 15;
		System.out.println("Area of the Rectangle:"+length*breadth);
	}

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.area();

	}

}
