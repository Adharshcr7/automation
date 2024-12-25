package assignmentprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*Assignment 55 - Write a program to demonstrate the collections class functions 
like sort, max, min, reverse, shuffle, swap, rotate, frequency, disjoint & replace*/
public class A55_collectionsClass {

	public static void main(String[] args) {
		List<Integer> L1 = new ArrayList<Integer>();
		L1.add(100);
		L1.add(129);
		L1.add(29);
		L1.add(82);
		L1.add(33);
		System.out.println(L1);
//Sorting
		Collections.sort(L1);
	    System.out.println("Sorted List"+L1);
//Max
	    System.out.println("Maximun value->"+Collections.max(L1));
//Min 
	    System.out.println("Minimum Value->"+Collections.min(L1));
//Reverse
	    Collections.reverse(L1);
	    System.out.println("Reversed List"+L1);
//Shuffle
	    Collections.shuffle(L1);
	    System.out.println("Shuffled->"+L1);
//Shuffle with random
	    Collections.shuffle(L1, new Random(5));
	    System.out.println("Shuffled Random->"+L1);
//Swap
	    Collections.swap(L1, 2, 4);
	    System.out.println("Swapped->"+L1);
//Rotate
	    Collections.rotate(L1, 3);
	    System.out.println("rotated->"+L1);
//Replace
	    Collections.replaceAll(L1, 129, 82);
	    System.out.println("Replaced->"+L1);
//Frequency
	  int a =  Collections.frequency(L1, 82);
	    System.out.println("Frequency->"+a);
	    List<Integer> L2 = new ArrayList<Integer>();
		L2.add(233);
		L2.add(100);	 
//Disjoint
		Boolean b1 =Collections.disjoint(L1, L2);
		System.out.println(b1);

	}

}
