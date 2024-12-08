package assignmentprograms;
import java.util.Arrays;
/*Assignment 31 - Write a program to check if the two given strings are Anagrams in JAVA?
String 1 ="listen"
String 2 ="silent" */

public class A31_Anagram {

	public static void main(String[] args) {
		String a = "listen";
		String b = "silent";
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		
         Arrays.sort(c1);
         Arrays.sort(c2);
         System.out.println(Arrays.toString(c1));
         System.out.println(Arrays.toString(c2));
         if(Arrays.equals(c1, c2)) {
        	 System.out.println("It's an Anagram");
         }else {
        	 System.out.println("It doesn't satisfy anagram");
         }
	}

}
