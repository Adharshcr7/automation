package assignmentprograms;
import java.util.Scanner;

/*Assignment 15 - Write a program that uses an'assert'statement to verify if an input age is within the 
 * range 0 to 65, and triggering an'AssertionError'if it is not.*/

public class A15_assert {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Please enter the age");
		int age = obj.nextInt();
		assert age<=65 && age>0:"Please enter valid age";
		System.out.println("Entered valid data and age is = "+age);
obj.close();
	}

}
