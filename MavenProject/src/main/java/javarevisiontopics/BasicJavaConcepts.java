package javarevisiontopics;

public class BasicJavaConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable declaration and definition
		//There are 2 types of datatypes. 1. Primitive 2. Non-primitve
		/*Primitive datatypes are :
		 * Integer
		 * Char
		 * Boolean
		 * Float
		 * 
		 * Non - primitive datatypes are:
		 * String
		 * Array
		 * */
		
		int a = 10;
		System.out.println("Integer variable:"+a);
		
		char c = 'v';
		System.out.println("Character variable:"+c);
		
		boolean b = true;
		System.out.println("Boolean variable:"+b);
		
		float f = 125.3f;
		System.out.println("Float variable:"+f);
		
		
		//String is a class not a datatype
		//Found in java.lang.string
		
		String s1 = "Sample"; // Using String literal - stores a sequence of characters in a memory known as String Constant pool(part of heap memory)
		
		String s2 = "Hello"; //String Instantiation - stores directly in heap memory
		
		
		System.out.println("String Literal:"+s1);
		System.out.println("String Instantiation:"+s2);
		
		//String  methods
		
		//To find the length of the given string use length() method
		
		String f1 = "Hello World";
		System.out.println("Length of the given string:"+f1);
		
		//To compare the two strings use equals() method
		String f2 = "hello world";
		
		if (f1.equals(f2)) {
			
			System.out.println("Both the strings are equal");
			
		}
		else {
			System.out.println("Strings are not equal");
		}
		
		
		//To compare the string by ignoring the case use equalsIgnorecase()
		
		if(f1.equalsIgnoreCase(f2)) {
			
			System.out.println("Ignore case- Both are strings are equal");
		}
		else {
			System.out.println("Both the strings are not equal");
		}
		
		//Contains() method can be used to find if a character is present inthe given string
		//Returns True if the character is present otherwise returns False
	
		System.out.println("The specified character is present in the string:"+f1.contains("H"));
		
		
		//tocharArray - to convert the given string to set of character array
		String x = "SunFlower";
		char[] c1 = x.toCharArray();
		
		for(int i=0;i<c1.length;i++) {
			
			System.out.println("Element in  the char array:"+c1[i]);
		}
		
		
		//CharAt(index) - to find a character present in the spercified index or not
		
		String name = "Java Programming";
		System.out.println("Character present at the given index:"+name.charAt(0));
		
		
		//Convert the given string to lowercase and uppercase
		System.out.println("Converting string to Lowercase:"+name.toLowerCase());
		
		System.out.println("Converting string to uppercase:"+name.toUpperCase());
		
		
		//Split the string using delimiter
		//case 1 - split string using space as a delimiter
		String n1 = "Java is an object oriented programming language";
		String[] splittedWords = n1.split(" ");
		for(int j=0;j<splittedWords.length;j++) {
			
			System.out.println("Splitted string:"+splittedWords[j]);
		}
		
		//case 2 - split string using character as delimiter
		
		String n2 = "Java@is@an@object@oriented@programming@language";
		String[] splittedWords1 = n2.split("@");
		for(int j=0;j<splittedWords1.length;j++) {
			
			System.out.println("Splitted string using @ as delimiter:"+splittedWords1[j]);
		}
		
		//Replace and replace all 
		
		String name2 = name.replace('J', 'L');
		
		System.out.println("Original string:"+name);
		System.out.println("Replaces string:"+name2);
		
		//replaceAll - used to replace each chars in a string
				String newrepValue = "Sunflower is the Yellow Flower festival 2025";
				String replacedValue1 = newrepValue.replaceAll("[A-Za-z]", "*");
				System.out.println(replacedValue1);
				
		String name3 = "Sun flower is  yellow in color";
		String replaced_value = name3.replaceAll("yellow", "******");
		System.out.println("Replace all:"+replaced_value);
		
		//ParseInt - Converts from string to int
		String amount = "2500";
		int num = Integer.parseInt(amount);
		System.out.println("Parsed amount from string to int:"+num);
	}

}
