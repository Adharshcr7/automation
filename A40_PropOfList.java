package assignmentprograms;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*Assignment 40
Write a program to demonstrate the properties of List in Java*/
public class A40_PropOfList {

	public static void main(String[] args) {
		List L1 = new LinkedList();
//List allows to store heterogeneous values and doesn't have any fixed list
		L1.add("Adharsh");
		L1.add(4007);
		L1.add('V');
		L1.add(283.2928);
		L1.add(29.38f);
		L1.add(288288828288828228l);
//List follows order of insertion and indexing
		System.out.println(L1);
//It allows null values
		L1.add(null);
		System.out.println(L1);
//It allows duplicate values
		L1.add(null);
		L1.add(4007);
		System.out.println(L1);
		System.out.println("Forward Iteration");
//It allows to iterate values using Iterator - forward iteration
		 Iterator IT = L1.iterator(); 
		 while(IT.hasNext()) {
		 System.out.println(IT.next()); 
		 }
		 System.out.println("Forward & Backward iteration");
//It allows to iterate values both forward & backward using list of iterator
		ListIterator LT = L1.listIterator();
		
		  while(LT.hasNext()){ 
			  System.out.println(LT.next()); 
			  }
		while(LT.hasPrevious()) {
			System.out.println(LT.previous());
		}


	}

}
