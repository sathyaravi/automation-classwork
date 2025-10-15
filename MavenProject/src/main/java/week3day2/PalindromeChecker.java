package week3day2;



public class PalindromeChecker {

	public static void main(String[] args) {
	
		String inputString = "race a car";
		
		//Convert the string from uppercase to lowercase and trim the spaces
		String lcase = inputString.toLowerCase();
		
		String checkString = lcase.replaceAll("[^a-z0-9]","");

		//Using two-pointer technique to check for palindrome
		
		boolean palindrome_check = true;
		int left = 0;
		int right = checkString.length()-1;
		
		while (left < right) {
			
			if(checkString.charAt(left) != checkString.charAt(right)) {
				palindrome_check = false;
				break;
			}
			left++;
			right--;
		}
		if (palindrome_check) {
			
			System.out.println("The given string is a Palindrome");
		}	
			
		else {
			
			System.out.println("The given String is not a Palindrome");
		}
		}
		
	}


