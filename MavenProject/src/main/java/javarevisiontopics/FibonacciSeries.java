package javarevisiontopics;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int fib = 1;
		for(int i=0;i<10;i++) {
			System.out.print(" "+num);
			int next = fib + num;
			num = fib;
			fib = next;
			
		}
		
		
	}

}
