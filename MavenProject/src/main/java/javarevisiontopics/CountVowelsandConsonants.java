package javarevisiontopics;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		
		String name = "JavaProgramming";
		
		int vowel_count = 0;
		int consonant_count=0;
		String vowel_string = "aeiou";
		
				
		char[] splitString = name.toCharArray();
		
		for(int i=0;i<splitString.length;i++) {
				char ch = splitString[i];
				if (vowel_string.contains(String.valueOf(ch))) {
					
					vowel_count++;
					
				}
				else {
					consonant_count++;
				}
			
		}
		System.out.println(vowel_count);
		System.out.println(consonant_count);
	}

}
