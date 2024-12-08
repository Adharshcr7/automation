package assignmentprograms;
/*Assignment 32 - a)find the output for the given string by using 'equals()' and 'equals
IgnoreCase()' String methods?
String1 = "Hello"
String2="hello"
b)Write a program that uses the 'contains()'method in the string class to check if the substrings: "Java" and "Python" are present in the string?
String = "Getting hands-on with Java is fun." */
public class A32_EqualsContains {
	public static void main(String[] args) {
//find the output for the given string by using 'equals()' and 'equalsIgnoreCase()' String methods?
		String a = "Hello";
		String b = "hello";
		System.out.println("Is both string are equal = "+a.equals(b));
		System.out.println("Is both string are equal = "+a.equalsIgnoreCase(b));
//Write a program that uses the 'contains()'method in the string class to check if the substrings: "Java" and "Python" are present 
//in the string? String = "Getting hands-on with Java is fun."
	     String c = "Getting hands-on with Java is fun.";
	     System.out.println("Does it contains java = "+c.contains("Java"));
	     System.out.println("Does it contains java = "+c.contains("Python"));
	}
}
