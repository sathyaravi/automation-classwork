package javarevisiontopics;

public class PalindromeString {

	public static void main(String[] args) {

				String name = "Selenium";
				char[] ch = name.toCharArray();
				String reversed_string="";
						
				
				for(int i=ch.length-1;i>=0;i--) {
					
					reversed_string=reversed_string+ch[i];
				}
				
				if (name.equalsIgnoreCase(reversed_string)) {
					System.out.println("The given string is a Palindrome");
				}
				
				else {
					System.out.println("The given string is not a Palindrome");
				}
				
				
			}

		


	}


