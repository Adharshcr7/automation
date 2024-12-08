package assignmentprograms;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
/*//Assignment 46 - Write a Java program that demonstrates the use of a single try and multiple catch block to handle  exceptions.
Create a Java program that performs various operations on an array. Handle exceptions like ArrayIndexOutOfBoundsException, 
NullPointerException, and ArithmeticException using a single try block with multiple catch blocks. */
public class A46_SingleTryManycatch {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Integer a = null;
		try {
			System.out.println("Please enter array size");
			int[] array = new int[s1.nextInt()];
			array[0] = 20;
			array[1] = 75;
			array[2] = a;
			array[3] = 89;
			int m = array[1]/array[2];
			System.out.println(m);
		}
			catch(IndexOutOfBoundsException E1){
				System.out.println("Exception occured E1 - Please enter array size within the boundary ");
				System.out.println("Please enter array size");
				int[] array = new int[s1.nextInt()];
				array[0] = 20;
				array[1] = 75;
				array[2] = 8;
				array[3] = 0;
				int m = array[1]/array[2];
				System.out.println(m);
			}
		catch(NullPointerException E2) {
			System.out.println("Exception occured E2 - Please enter numeric values only");
			System.out.println("Please enter array size");
			int[] array = new int[s1.nextInt()];
			array[0] = 20;
			array[1] = 75;
			array[2] = 8;
			array[3] = 0;
			int m = array[1]/array[2];
			System.out.println(m);
		}
		catch(ArithmeticException E3) {
			System.out.println("Exception occured E3 - Please enter valid numbers to perform division on 2 arrays");
			System.out.println("Please enter array size");
			int[] array = new int[s1.nextInt()];
			array[0] = 20;
			array[1] = 75;
			array[2] = 8;
			array[3] = 0;
			int m = array[1]/array[2];
			System.out.println(m);
		}
		catch(InputMismatchException E4) {
			System.out.println("Exception occured E4 - Please enter int value only in array size");
			s1.nextLine();
			System.out.println("Please enter array size");
			int[] array = new int[s1.nextInt()];
			array[0] = 20;
			array[1] = 75;
			array[2] = 8;
			array[3] = 0;
			int m = array[1]/array[2];
			System.out.println(m);
		}
		System.out.println("Single Try and Mulitple Catch code executed successfully");
		}
}


