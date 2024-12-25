package assignmentprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

//Assignment 72 - Write a program to demonstrate Finally block in exception handling
public class A72_Finally {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		try {
			System.out.println("Please enter the int value");
			int a = s1.nextInt();
			System.out.println(a);
		}
		catch(InputMismatchException e1) {
			System.out.println("Please enter integer value only");
			s1.nextLine();
			int a = s1.nextInt();
			System.out.println(a);
		}
		finally {
			System.out.println("Executed successfully");
		}

	}

}
