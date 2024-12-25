package assignmentprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Assignment 60 - Write a program to iterate Map interface using Entryset function with for each loop
public class A60_mapentryset {

	public static void main(String[] args) {
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("Adharsh", 'V');
		m1.put("Ronaldo", 'C');
		m1.put("Messi", 'L');
		m1.put("Beckham", 'D');
		m1.put("Maldini", 'P');
		for(Entry<String, Character> s1:m1.entrySet()) {
			System.out.println(s1);
		}


	}

}
