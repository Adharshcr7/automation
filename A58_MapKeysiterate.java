package assignmentprograms;
//Assignment 58 - Write a program to iterate Map interface using for each loop for Keyset
import java.util.HashMap;
import java.util.Map;

public class A58_MapKeysiterate {

	public static void main(String[] args) {
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("Adharsh", 'V');
		m1.put("Ronaldo", 'C');
		m1.put("Messi", 'L');
		m1.put("Beckham", 'D');
		m1.put("Maldini", 'P');
		for(String s1:m1.keySet()) {
			System.out.println(s1);
		}
	}

}
