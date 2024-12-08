package assignmentprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/*Assignment 48
Write a program using List to reverse the given list and also to reverse the words within the list o/p ex :[irawiT, ramuK, hsinaM]*/
public class A48_ReverseList {
	public static void main(String[] args) {
		List<String> listt = new ArrayList<String>();
		listt.add("Manish");
		listt.add("Kumar");
		listt.add("Tiwari");
//Reversed the list by converting to string		
		String a = listt.toString();
		String rev = "";
		System.out.println(a.length());
		for (int i = 21; i > 0; i--) {
			char s33 = a.charAt(i);
			rev = rev + s33;
		}
		System.out.println("String reverse->" + rev);
//Reversing the list using array
		String b = listt.toString();
		char[] cc = b.toCharArray();
		String cv = "";
		// System.out.println(Arrays.toString(cc));
		for (int j = 21; j > 0; j--) {
			cv = cv + cc[j];
		}
		System.out.println("Array Reverse->" + cv);
//reversed using for each loop
		List<String> sb = new ArrayList<String>(listt);
		System.out.println(sb);
		for (String listing : listt) {
			StringBuilder s1 = new StringBuilder(listing);
			sb.add(s1.reverse().toString());
			System.out.print(s1);
		}
	}

}
