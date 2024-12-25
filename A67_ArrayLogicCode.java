package assignmentprograms;
//Assignment 67 - Write a array program to find average value from given array values
public class A67_ArrayLogicCode {

	public static void main(String[] args) {
		int[] arr1 = {25,26,45,67,90};
		int sum = 0;
		for(int i = 0;i<5;i++) {
			sum=sum+arr1[i];
		}System.out.println(sum);
        int average = sum/arr1.length;
        System.out.println(average);
	}

}
