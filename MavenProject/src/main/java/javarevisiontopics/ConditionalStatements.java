package javarevisiontopics;



public class ConditionalStatements {

	public static void main(String[] args) {
		
		//Control statements - defines the flow of execution of a program
		
		//Selection based statements - if, if--else, switch-case
		
		//If condition
		int a = 20;
		if (a<50) {
			System.out.println("a is less than 50");
		}
		
		//If else condition
		int b = 25;
		
		if (b<a) {
			System.out.println("b is less than a");
		}
		else {
			System.out.println(" a is less than b");
		}
		
		//nested if..else
		int amount = 25000;
		
		if (amount < 10000) {
			System.out.println("amount is less than 10000");
		}
		else if (amount < 15000) {
			System.out.println("amount is less than 15000");
			
		}
		else if (amount < 20000) {
			System.out.println("amount is less than 20000");
		}
		else {
			System.out.println("amount is greater than or equal to 25000");
		}
		
		//Switch -case syntax 
		String nameOfDay = "Tue";
		
		switch(nameOfDay) {
		
		case "Sun":
			System.out.println("Sunday");
			break;
			
		case "Mon":
			System.out.println("Monday");
			break;
			
		case "Tue":
			System.out.println("Tuesday");
			break;
			
		case "Wed":
			System.out.println("Wednesday");
			break;
					
		case "Thur":
			System.out.println("Thursday");
			break;
			
		case "Fri":
			System.out.println("Friday");
			break;
			
		case "Sat":
			System.out.println("Saturday");
			break;
			
		default:
			System.out.println("Today is holiday");
			break;
		
		
		}
		
		//For loop - Iteration
		
		int num = 50;
		
		for (int i=0;i<num;i++) {
			
			System.out.println(i);
		}
		
		//print the pattern
		
		int n1 = 10;
		
		for(int i=n1;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
			
			System.out.print("*");
		}
		System.out.println(" ");
		}
		
		
		int n2 = 5;
		for(int i=1;i<=n2;i++) {
			
			for(int j=1;j<=i;j++) {
			
			System.out.print("*");
		}
		System.out.println(" ");
		}
		
		
		
		//While loop
		
		int val =25;
		while(val<=50) {
			int sum =val;
			System.out.println(sum);
			val += 5;
		}
		
	}

}
