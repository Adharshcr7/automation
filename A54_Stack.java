package assignmentprograms;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

//Assignment 54 - Write a program to demonstrate the properties of Stack class and use some of the Stack functions like pop(), peak() & push()
public class A54_Stack {

	public static void main(String[] args) {
		Stack s1 = new Stack();
//It allows heterogeneous values to store and uses push() to add elements
		s1.push("Adharsh");
		s1.push(4007);
		s1.push(1.89f);
		s1.push(92827717171l);
		s1.push('V');
//It follows order of insertion & indexing 
		System.out.println(s1);
//It allows null and duplicate values
		s1.push(null);
		s1.push(null);
		s1.push("Hello");
		System.out.println(s1);
//POP() - helps to remove last object 
		System.out.println(s1.pop());
		System.out.println();
//Peak() - helps to show last object
		System.out.println(s1.peek());
//It allows iteration, list iteration & enumeration
//Iterator
		Iterator i1 = s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println();
//List iterator
		ListIterator li1 = s1.listIterator();
		while(li1.hasNext()) {
			System.out.println(li1.next());
		}System.out.println();
		while(li1.hasPrevious()) {
			System.out.println(li1.previous());
		}
		System.out.println();
//Enumeration
		Enumeration enuu = s1.elements();
		while(enuu.hasMoreElements()) {
			System.out.println(enuu.nextElement());
		}
		System.out.println();
		
		
		 
	}

}
