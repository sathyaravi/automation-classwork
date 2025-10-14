package week2day4;

import java.util.Scanner;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);

		String word = scanner.nextLine();
		String [] wordlist = word.trim().split("\\s+");
		int last_word_length=wordlist[wordlist.length-1].length();
		System.out.println("The length of the last word:"+last_word_length);
		scanner.close();	
		}
	}


