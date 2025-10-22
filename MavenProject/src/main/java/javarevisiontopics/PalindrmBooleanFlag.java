package javarevisiontopics;

public class PalindrmBooleanFlag {

	public static void main(String[] args) {
		
		String name1 = "nurses run";
		name1 = name1.replaceAll("\\s+", ""); //In case if the input contains spaces

		String revString = "";
		char[] ch1 = name1.toCharArray();
		
		boolean isPalindrome = true;
		
		for(int j=ch1.length-1;j>=0;j--) {
			
			revString = revString+ch1[j];
			
		}
		if (name1.equalsIgnoreCase(revString)) {
			isPalindrome = true;
		}
		else {
			isPalindrome = false;
		}
		
		if (isPalindrome) {
			System.out.println("The given string is a Palindrome:"+revString);
		}
		else { 
			
			System.out.println("The given string is not a Palindrome:"+revString);
		}

	}

}
