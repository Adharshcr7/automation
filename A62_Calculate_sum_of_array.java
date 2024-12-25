package assignmentprograms;

import java.util.Scanner;

//Assignment 62 - Write a program to calculate the sum of all elements in an integer array using a for-each loop.
public class A62_Calculate_sum_of_array {

	public static void main(String[] args) {
	int[] inte = new int[5];
	Scanner s1 = new Scanner(System.in);
	inte[0] = s1.nextInt();
	inte[1] = s1.nextInt();
	inte[2] = s1.nextInt();
	inte[3] = s1.nextInt();
	inte[4] = s1.nextInt();
	int i = 0;
	int sum=0;
	for(int m1:inte) {
		sum=sum+inte[i];
		i++;
	}System.out.println(sum);
	s1.close();
	}

}
