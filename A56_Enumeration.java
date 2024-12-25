package assignmentprograms;

import java.util.Enumeration;
import java.util.Stack;

//Assignment 56 - Write a program to print the list of animals using enumeration
public class A56_Enumeration {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<String>();
		s1.push("Rhino");
		s1.push("Wild Buffalo");
		s1.push("Cheetah");
		s1.push("Peacock");
//Enumeration
		Enumeration e1 = s1.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}

	}

}
