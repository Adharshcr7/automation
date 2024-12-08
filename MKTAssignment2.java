package assignmentprograms;

import java.util.Arrays;
import java.util.Scanner;

public class MKTAssignment2 {
	public static void main(String[] args) {
	//print boolean datatype
			boolean[] boo = new boolean[3];
			boo[0] = true;
			boo[1] = true;
			boo[2] = false;
			System.out.println(Arrays.toString(boo));
	//print double datatype
			double[] as = new double[2];
			as[0] = 9282.92828;
			as[1] = 28.2918;
			System.out.println(Arrays.toString(as));
	//print scanner value
			String[] names = new String[3];
			Scanner s1 = new Scanner(System.in);
			names[0] = s1.next();
			names[1] = s1.next();
			names[2] = s1.next();
			System.out.println(Arrays.toString(names));
	//check 2 arrays are equal
			String[] n = new String[2]; 
			String[] s = new String[2];
			n[0] = "Messi";
			n[1] = "Ronaldo0";
			s[0] = "Messi";
			s[1] = "Ronaldo";
			System.out.println(Arrays.toString(n));
			System.out.println(Arrays.toString(s));
			if(Arrays.equals(n, s)) {
				System.out.println("2 arrays are equal");
			}else {
				System.out.println("2 arrays are not equal");
			}
		}

	}


