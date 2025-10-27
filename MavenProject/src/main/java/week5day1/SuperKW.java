package week5day1;

public class SuperKW extends ConstructorCreation {
	
	public SuperKW() {
		
		super.name = "Doug";
		super.num = 50;
		System.out.println("Inside super kw method");
	}
	public static void main(String[] args) {
		SuperKW obj = new SuperKW();
		
		System.out.println(obj.name);

	}

}
