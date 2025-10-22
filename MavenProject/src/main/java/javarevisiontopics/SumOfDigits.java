package javarevisiontopics;

public class SumOfDigits {

	public static void main(String[] args) {
		//to find the sum of digits
		int num = 12345;
		
		int sum = 0;
		
		while(num>0) {
			
			sum += num%10;
			num = num / 10;
					
		}
		System.out.println("Sum of the given digits:"+sum);

	}

}
