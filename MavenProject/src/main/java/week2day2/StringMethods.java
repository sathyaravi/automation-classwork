package week2day2;

public class StringMethods {

	public static void main(String[] args) {
		String name1 = "Butterfly";
		String name2 = "butterfly";
		
		//To find the length of the string - varname.length()
		System.out.println("The length of the string name :"+name1.length());
		
		//To find the if the two strings are equal or not
		if (name1.equals(name2)) {
			
			System.out.println("Both the strings are equal");
		}
		else {
			System.out.println("Both the strings are not equal");
		}
		
		//to find the if the two strings are equal ignoring the case sensitivity
		
		if (name1.equalsIgnoreCase(name2)) {
			
			System.out.println("Both the strings are equal by ignoring case sensitivity");
		}
		else {
			System.out.println("Both the strings are not equal");
		}
		
		
		// To find the certain char is present in a string or not
		
		boolean contains = name1.contains("B");
		System.out.println(contains);
		
		//to charArray - convert string to characters
		String companyName = "TestLeaf";
		
		char[] charArray = companyName.toCharArray();
		
		for (int i=0;i<charArray.length;i++) {
			
			System.out.println(charArray[i]);
		}
		
		//to find a character find at the specified index
		
		System.out.println("Character present at index:"+name1.charAt(8));
		
		//split -split the string using delimiter
		
		String newName = "Today is Monday";
		
		String[] splitName = newName.split(" ");
		
		for (int i=0;i<splitName.length;i++) {
			System.out.println(splitName[i]);
		}
		
		//replace - used to replace characters(old with new one)
		String newValue = "Sunflower";
		String replacedValue = newValue.replace('S', 'F');
		System.out.println(replacedValue);
		
		
		//replaceAll - used to replace each chars in a string
		String newrepValue = "Sunflower is the Yellow Flower festival 2025";
		String replacedValue1 = newrepValue.replaceAll("[A-Za-z]", "*");
		System.out.println(replacedValue1);
		
		//to lowercase - convert the string in lowercase from uppercase
		
		String ucase = "SUNFLOWER";
		System.out.println(ucase);
		System.out.println(ucase.toLowerCase());
		
		//to uppercase - convert the string in upercase from lowercase
		
		String lcase = "sunflower";
		System.out.println(lcase);
		System.out.println(lcase.toUpperCase());
		
		
		// parseInt -converts from string to int
		String amount = "2500";
		int num = Integer.parseInt(amount);
		System.out.println(num);
		
		for (int i = 1; i <= 3; i++) {
		    for (int j = 1; j <= 2; j++) {
		        System.out.print(i + "," + j + " ");
		    }
		}

	}
}
