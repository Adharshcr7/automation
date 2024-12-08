package assignmentprograms;
import java.util.Arrays;
/*Assignment 28 - Write a Java program to create and display an array of boolean and double data types. 
Initialize the arrays with some sample values and display them in array form.*/
public class A28_BooleanDouble_Array {
	public static void main(String[] args) {
//Array of Boolean values
		boolean[] b1 = new boolean[4];
		b1[0] = true;
		b1[1] = false;
		b1[2] = true;
		b1[3] = false;
System.out.println(Arrays.toString(b1));
//Array of double values
		double d1[] = new double[3];
		d1[0] = 56.899;
		d1[1] = 78.398;
		d1[2] = 98.99;
		System.out.println(Arrays.toString(d1));
	}

}
