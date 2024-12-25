package assignmentprograms;

import java.util.Scanner;

//Assignment 68 - Check the number 34 (or) any user input is a part of your array or not. If yes then find out it's indexing value
public class A68_ArrayLogicQues2 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		arr1[0] = 26;
		arr1[1] = 55;
		arr1[2] = 67;
		arr1[3] = 86;
		arr1[4] = 93;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the value to check availability");
		int input = s1.nextInt();
		for(int i =0;i<5;i++) {
			if(arr1[i]==input) {
				System.out.println("value exist");
				System.out.println("Index->"+i);
				
			}
		}
	}
}


