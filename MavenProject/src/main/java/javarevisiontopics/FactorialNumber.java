package javarevisiontopics;

public class FactorialNumber {

	public static void main(String[] args) {
		// Factorial number
		
		int num = 7;
		int fact = 1;
		
		if ((num==0) || (num==1)) {
			
			System.out.println("The factorial of the number:"+fact);
			
		}
		
		while (num>1) {
			
			fact *= num;
			num = num-1;
			
		}
		
		System.out.println("The factorial of the given number:"+fact);
	}

}
