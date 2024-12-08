package assignmentprograms;

import java.util.Scanner;

/*Assignment 52 - Write a program to demonstrate the concept of throw and throws keyword 
Create a custom exception called InvalidAgeException. Write a method that checks if a person is eligible to vote (age >= 18). 
If the age is less than 18, the method should throw InvalidAgeException*/
public class A52_ThrowThrows {

	public static void main(String[] args) throws Exception {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter the age to check whether eligible to vote");
		int age = s1.nextInt();
		if(age>=18) {
			System.out.println("Person is eligible to vote");
		}else {
			System.out.println("Person is not eligible to vote"); throw new Exception("InvalidAgeException");
		}
	}

}
