package assignmentprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*Assignment 63
Write a program to print the list of animals using list iterator and use following functions like hasNext, Next, hasPrevious, previous,  add, & set
*/public class A63_Listiterator {

	public static void main(String[] args) {
	List<String> l1 = new ArrayList<String>();
	l1.add("Rhino");
	l1.add("Panda");
	l1.add("Cheetah");
	l1.add("Bison");
	l1.add("Dog");
	ListIterator li = l1.listIterator();
	while(li.hasNext()) {
		System.out.println(li.next());
	}System.out.println();
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
	l1.add("Peacock");
	l1.set(1, "Koala bear");
	System.out.println(l1);

	}

}
