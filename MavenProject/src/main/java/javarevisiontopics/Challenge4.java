package javarevisiontopics;

public class Challenge4 {

	public static void main(String[] args) {
		
		//Declaring the non empty array of integers
		int [] nums = {2,2,1,1,4,4,-9};
		
		//int variable to store the output
		
		int single_num = 0;
		
		for(int i=0;i<nums.length;i++) {
			
			single_num ^= nums[i];
						
			}
		System.out.println("Single element found:"+single_num);
			}
		
		
		

	}


