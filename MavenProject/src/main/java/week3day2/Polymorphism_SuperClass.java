package week3day2;

public class Polymorphism_SuperClass {
	
	public void reportStep(String message, String status) {
		
		System.out.println(message+" "+status);

	}
	
	public void reportStep() {
		System.out.println("Report Step method Overloaded");

	}
	public static void main(String[] args) {
		
		Polymorphism_SuperClass newobj = new Polymorphism_SuperClass();
		newobj.reportStep("Hello World","Pass");
		newobj.reportStep();

	}

}
