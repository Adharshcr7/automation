package assignmentprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//Assignment 61 - Write a program to iterate Map interface using Set<Entry<K,V>> with iterators concept
public class A61_Mapsetentry {

	public static void main(String[] args) {
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("Adharsh", 'V');
		m1.put("Ronaldo", 'C');
		m1.put("Messi", 'L');
		m1.put("Beckham", 'D');
		m1.put("Maldini", 'P');
		Set<Entry<String, Character>> m2 = m1.entrySet();
		Iterator i1 = m2.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		

	}

}
