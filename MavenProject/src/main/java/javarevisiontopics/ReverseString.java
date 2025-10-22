package javarevisiontopics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Selenium";
		char[] ch = name.toCharArray();
		String reversed_string="";
		
		for(int i=ch.length-1;i>=0;i--) {
			
			System.out.print(ch[i]);
			reversed_string=reversed_string+ch[i];
		}
		System.out.println();
		
	}

}
