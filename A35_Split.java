package assignmentprograms;
import java.util.Arrays;
/* Assignment 35
i)Write a program to split the string "Java is fun" into individual words.
ii)Split the string "Java Python C++" using a comma.
iii)Split the string "Java is fun to learn" into at most 3 parts.
iv)Write a program to split a sentence into words, count the words, and print them. */
public class A35_Split {
public static void main(String[] args) {
//Write a program to split the string "Java is fun" into individual words.
		String a = "Java is fun";
	    String[] a1 = a.split("");
	    System.out.println(Arrays.toString(a1));
//Split the string "Java Python C++" using a comma.
	    String b = "Java Python C++";
	    String[] a2 = b.split(" ");
	    System.out.println(Arrays.toString(a2));
//Split the string "Java is fun to learn" into at most 3 parts.
	    String c = "Java is fun to learn";
	    String[] a3 = c.split((" "), 3);
	    System.out.println(Arrays.toString(a3));
//Write a program to split a sentence into words, count the words, and print them.
	    String d = "Java is fun to learn";
	    String [] m = d.split(" ");
	    System.out.println(Arrays.toString(m));
	    System.out.println("The count of the words->"+m.length);	    
	}
}
