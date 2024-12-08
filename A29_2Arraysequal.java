package assignmentprograms;
import java.util.Arrays;
/**Assignment 29 - Write a progrm for the given strings, to check if the both arrays are equal to each other. here, 
String1: "kv no2 bangalore"
String2: "karnataka"*/
public class A29_2Arraysequal {
	public static void main(String[] args) {
//To check whether 2 strings are equal
		String s1 = "kv no2 bangalore";
		String s2 = "karnataka";
		if(s1.equals(s2)){
			System.out.println("2 string are equal");
		}else {
			System.out.println("2 String are not equal");
		}
//To check whether 2 array string are equal
	    String[] s3 = new String[2];
		s3[0] = "kv no2 bangalore";
		s3[1] = "karnataka";
		char[] ss = s3[0].toCharArray();
		char[] sss = s3[1].toCharArray();
		System.out.println(Arrays.toString(ss));
		System.out.println(Arrays.toString(sss));
		if(Arrays.equals(ss, sss)) {
			System.out.println("2 Arrays are equal");
		}else {
			System.out.println("2 Arrays are not equal");
		}
		}
	}

