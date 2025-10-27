package week5day1;

public class StaticKW {
	
	
	//static variable
	static int num = 10;
	
	//static method
	
	public static void staticMethod() {
		System.out.println("Inside static method");
		
	}
	
	//static block
	static {
		System.out.println("Inside static block");
	}
	
	
	
	public static void main(String[] args) {
		staticMethod();
		
		StaticKW.staticMethod();
		
		System.out.println(StaticKW.num);

	}

}
