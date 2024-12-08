package assignmentprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Assignment 41 - Write a program to demonstrate the properties of Set in Java
public class A41_PropOfSet {
	public static void main(String[] args) {
		Set s1 = new HashSet();
//It allows to store heterogeneous values and doesn't have any fixed size
		s1.add("Adharsh");
		s1.add(4007);
		s1.add(293.99f);
		s1.add(28282.383838383);
		s1.add('V');
		s1.add(128381283l);
//It does not follow order of insertion and indexing
		System.out.println(s1);
//It allows null value
		s1.add(null);
		System.out.println(s1);
//It does not allow duplicate values
		s1.add(null);
		s1.add('V');
		s1.add(4007);
		System.out.println(s1);
//It allows to use Iterator for forward iteration but doesn't support list of iterator
		Iterator IT = s1.iterator();
		while(IT.hasNext()) {
			System.out.println(IT.next());
		}
	}

}
