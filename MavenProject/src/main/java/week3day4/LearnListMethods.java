package week3day4;

import java.util.ArrayList;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {
		
		List <Integer> value = new ArrayList <Integer> ();
		value.add(1);
		value.add(100);
		value.add(35);
		value.add(50);
		value.add(45);
		System.out.println(value);
		
		value.add(25,35);
		System.out.println(value);
		

	}

}
