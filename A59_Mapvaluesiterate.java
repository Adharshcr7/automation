package assignmentprograms;

import java.util.HashMap;
import java.util.Map;

//Assignment 59 - Write a program to iterate Map interface using for each loop for Values
public class A59_Mapvaluesiterate {

	public static void main(String[] args) {
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("Adharsh", 'V');
		m1.put("Ronaldo", 'C');
		m1.put("Messi", 'L');
		m1.put("Beckham", 'D');
		m1.put("Maldini", 'P');
		for(char s1:m1.values()) {
			System.out.println(s1);
		}

	}

}
