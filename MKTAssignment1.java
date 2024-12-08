package assignmentprograms;
import java.util.Arrays;
public class MKTAssignment1 {

	public static void main(String[] args) {
		//Array syntax datatype[] variable = new datatype[size];
				String[] name = new String[5];
				name[0] = "Adharsh";
				name[1] = "Adharsh1";
				name[2] = "Adharsh2";
				name[3] = "Adharsh3";
				name[4] = "Adharsh4";
		//Calling string using arrays function
				System.out.println(Arrays.toString(name));
		//calling through print statement
				System.out.println(name[0]);
				System.out.println(name[1]);
				System.out.println(name[2]);
				System.out.println(name[3]);
				System.out.println(name[4]);
		//calling array using for-loop
				for(int i=0;i<5;i++) {
					System.out.print(name[i]);
				}
			}

		


	}


