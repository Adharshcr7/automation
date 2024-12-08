package assignmentprograms;

import java.util.Arrays;
import java.util.Scanner;

/*Assignment 44
Write a Java program to create an array of integers and populate it with values entered by the user using scanner class*/

public class A44_ArraywithScannerClass {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter array size");
		Integer[] num = new Integer[s1.nextInt()];
		System.out.println("Please enter value of integer num[0]");
		num[0] = s1.nextInt();
		System.out.println("Please enter value of integer num[1]");
		num[1] = s1.nextInt();
		System.out.println("Please enter value of integer num[2]");
		num[2] = s1.nextInt();
		System.out.println("Please enter value of integer num[3]");
		num[3] = s1.nextInt();
		System.out.println("Please enter value of integer num[4]");
		num[4] = s1.nextInt();
//printing arrays using for-loop
		for(int i = 0;i<num.length;i++) {
			System.out.println(num[i]);
		}
//Printing arrays using array function
		System.out.println(Arrays.toString(num));
//Printing arrays with input using scanner class
		Integer[] num2 = new Integer[s1.nextInt()];	
	for(int j = 0;j<num2.length;j++) {
		num2[j] = s1.nextInt();
	}System.out.println(Arrays.toString(num2));

	}

}
