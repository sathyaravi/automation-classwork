package geometrycalculator;

public class Triangle extends Shape {
	
	@Override
	public void area() {
		int breadth = 10;
		int height = 20;
		float f = 0.5f;
		
		System.out.println("Area of the triangle:"+f*breadth*height);
	}
	
	public static void main(String[] args) {
		Triangle obj = new Triangle();
		obj.area();
	}

}
