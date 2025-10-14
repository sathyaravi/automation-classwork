package week3day2;

public class Override_Subclass extends Polymorphism_MethodOverride{
	
	@Override
	public void methodOverride() {
		
		System.out.println("Inside Subclass");
	}
	
	public static void main(String[] args) {
		
		Override_Subclass obj = new Override_Subclass();
		obj.methodOverride();
	}

}
