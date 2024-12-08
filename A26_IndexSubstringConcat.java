package assignmentprograms;
/* Assignment 26 - i)Find the index of a character 'c' in a given string. String a1 = "Welcome India"
ii)Retrieve the character at index '4'in a given string. String str = "Programming "
iii)Concatenate two strings. String str1 = "Hello,"String str2 = "World"
iv)Extract a substring from the index '11' to the end of the string. String name = "Welcome to Java Programming"
v)Extract a substring from index 0 to 11,String P1 = "Programming is fun" */
public class A26_IndexSubstringConcat {

	public static void main(String[] args) {
//Find the index of a character 'c' in a given string. String a1 = "Welcome India"
		String a1 = "Welcome India";
		System.out.println("The index of character 'c' is "+a1.indexOf("c"));
//Retrieve the character at index '4'in a given string. String str = "Programming "
		String str = "programming";
		System.out.println("The character at index 4 from given string is "+str.charAt(4));
//Concatenate two strings. String str1 = "Hello,"String str2 = "World"
		String str1 = "Hello";
		String str2 = "World";
		System.out.println("Concatenation of 2 strings = "+str1+" "+str2);
		System.out.println("Concatenation of 2 strings = "+str1.concat(str2));
//Extract a substring from the index '11' to the end of the string. String name = "Welcome to Java Programming"
		String name = "Welcome to Java Programming";
		System.out.println("Substring of index 11 -> "+name.substring(11));
//Extract a substring from index 0 to 11,String P1 = "Programming is fun"
		String P1 = "Programming is fun";
		System.out.println("Substring from index 0 to 11 -> "+P1.substring(0, 11));
	}

}
