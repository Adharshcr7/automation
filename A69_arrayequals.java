package assignmentprograms;

import java.util.Arrays;

//Assignment 69 - Write a program with 2 arrays and check whether both arrays are equal or not
public class A69_arrayequals {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		arr1[0] = 26;
		arr1[1] = 55;
		arr1[2] = 67;
		arr1[3] = 86;
		arr1[4] = 93;
		int[] arr2 = {26,55,67,86,93};
	if(Arrays.equals(arr1, arr2)) {
		System.out.println("Both arrays are equal");
	}else {
		System.out.println("Both arrays are not equal");
	}

	}

}
