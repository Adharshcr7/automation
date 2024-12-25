package assignmentprograms;

import java.util.Arrays;

/*Assignment 70 - Write a array program and print them using following ways:i) Using For Loopii) Using For-each Loopiii) Print Statement (Sysout)
iv) Sysout with array function*/
public class A70_Printing_Arrays {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		arr1[0] = 26;
		arr1[1] = 55;
		arr1[2] = 67;
		arr1[3] = 86;
		arr1[4] = 93;
//Printing using For-loop
		for(int i = 0; i<5;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
//Printing using For-each loop
		for(int ss:arr1) {
			System.out.println(ss);
		}
		System.out.println();
//Printing using array functions
		System.out.println(Arrays.toString(arr1));
		System.out.println();
//Printing in sysout printing method
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	System.out.println(arr1[3]);
	System.out.println(arr1[4]);
	}
}
