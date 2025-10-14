package week3day2;



public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner S = new Scanner(System.in);
		//String word = S.nextLine();
		
		//String[] word_list = word.trim().split("\\s+");
		String S = "race a car";
		
		String lcase = S.toLowerCase();
		
		String checkString = lcase.replaceAll("[^a-z0-9]","");
		
		//String reverse_string = new 
		System.out.println(checkString);
		
		
		
	}

}
