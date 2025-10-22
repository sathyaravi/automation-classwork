package javarevisiontopics;

public class LargestNumber {

	public static void main(String[] args) {
		// array declaration
		int [] num = {10,25,15};
		//int variable to store the largest number - in case if negative numbers present in the array
		int large_num = num[0];
		//Find the largest number present in the array
		for(int i=0;i<=num.length-1;i++) {
			
			if(num[i]>large_num) {
				large_num=num[i];
			}
			
		}
		
		System.out.println("The largest number in the array:"+large_num);

	}

}
