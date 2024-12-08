package assignmentprograms;
import java.util.Scanner;
//check the number 34 is a part of array or not if yes then find out it's indexing
public class MKTAssignment3 {
void array() {
	int[] a1 = new int[5];
	a1[0]=56;
	a1[1]=47;
	a1[2]=32;
	a1[3]=68;
	a1[4]=43;
	Scanner s1 = new Scanner(System.in);
	System.out.println("Please int value");
	int check = s1.nextInt();
	for(int i = 0;i<5;i++) {
		if(a1[i]==check) {
			System.out.println("Value matches with the input");
			System.out.println("Index value->"+i);
		}
	}
}
	public static void main(String[] args) {
		 MKTAssignment3 ss = new  MKTAssignment3();
		 ss.array();
	}

}
