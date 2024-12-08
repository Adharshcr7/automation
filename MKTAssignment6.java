package assignmentprograms;

import java.util.Arrays;

//There is a set of arrays we need to find the average value of it
public class MKTAssignment6 {
public static void main(String[] args) {
	int s1[] = new int[4];
	s1[0] = 92;
	s1[1] = 86;
	s1[2] = 73;
	s1[3] = 67;
	/*System.out.println(Arrays.toString(s1));
	int total = s1[0]+s1[1]+s1[2]+s1[3];
	System.out.println(total/s1.length);*/
	double sum = 0;
	for(int i = 0;i<s1.length;i++) {
		
		sum = sum+s1[i];	
	}System.out.println(sum);
	System.out.println("Average of Sum = "+sum/s1.length);
}
}
