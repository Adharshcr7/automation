package assignmentprograms;

import java.util.Scanner;

//Assignment 45 - Write a Java program that demonstrates the use of a single try-catch block to handle potential exceptions.
/*Write a Java program that prompts the user to enter a string and an index. The program should then attempt to 
 * print the character at the given index in the string. If the index is out of bounds, 
 * the program should catch the StringIndexOutOfBoundsException and display a friendly error message. 
 * The program should then prompt the user to enter a valid index.*/
public class A45_SingleTryCatch {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		try {
			System.out.println("Please enter the string data");
			String name = s1.next();
			System.out.println("Please enter the index value");
			int index = s1.nextInt();
			char cc = name.charAt(index);
			System.out.println("The character at given index is->"+cc);
			
		}
		catch(StringIndexOutOfBoundsException E1) {
			System.out.println("Please enter some other number that falls under index from given string value");
			System.out.println("Please enter the string data");
			String name = s1.next();
			System.out.println("Please enter the index value");
			int index = s1.nextInt();
			char cc = name.charAt(index);
			System.out.println("The character at given index is->"+cc);
		}

	}

}
