package assignmentprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*Assignment 47:
Write a program to print the list of animals using iterator and use this following functions like hasNext, Next & remove */
public class A47_Iterator {

	public static void main(String[] args) {
		Set<String> animal = new HashSet<String>();
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Rhino");
		animal.add("Komodo");
		//animal.remove("Lion");
		Iterator<String> ITR = animal.iterator();
		while(ITR.hasNext()) {
			
			System.out.println(ITR.next());
			
		}animal.remove("Lion");
		System.out.println(animal);

	}

}
