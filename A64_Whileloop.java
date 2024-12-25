package assignmentprograms;
//Assignment 64 - Write a program to calculate the sum of the first 50 natural numbers using a while loop.
public class A64_Whileloop {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=50) {
			sum=sum+i;
			i++;
			
		}System.out.println(sum);

	}

}
