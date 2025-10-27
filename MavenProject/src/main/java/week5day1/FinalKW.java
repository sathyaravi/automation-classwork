package week5day1;

public final class FinalKW {
		 
	//final variable
	
	final int num =10;
		
	//final method
	
	public final void finalMethod() {
		
		System.out.println("Inside final method");
		System.out.println("Value of the final variable cannot be reassigned");
	
	}
		
	public static void main(String[] args) {
		
		FinalKW obj = new FinalKW();
		System.out.println(obj.num);
		obj.finalMethod();
	}

}
