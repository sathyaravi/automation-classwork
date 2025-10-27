package week5day1;

public class ConstructorCreation {
	
	int num;
	String name;
	
	public ConstructorCreation() {
		System.out.println("Default Constructor method");
	}
	
	public ConstructorCreation(int num,String name) {
		System.out.println("Parameterized Constructor method");
	}
	
	public ConstructorCreation(String name) {
		System.out.println("Parameterized Constructor method");
	}
	
	public ConstructorCreation(String name,int num) {
		System.out.println("Parameterized Constructor method");
	}
	
	public static void main(String[] args) {
		ConstructorCreation obj = new ConstructorCreation();
		
		obj.num = 10;
		obj.name ="John";
		
		System.out.println(obj.num  + " "  +obj.name);

	}

}
