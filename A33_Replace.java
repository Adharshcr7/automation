package assignmentprograms;
/*Assignment 33 - Write a program for the below.here, String input= "Hello! 123Bye 789 "
i) Replace all numeric characters in a given string with an empty string ("").
ii)Replace all capital letters in a given string with an empty string ("").
iii)Replace all lower letters in a given string with an empty string ("").
iv)Replace the letter 'e' with 'y'*/
public class A33_Replace {
	public static void main(String[] args) {
     String input = "Hello! 123Bye 789 ";
//Replace all numeric characters in a given string with an empty string ("").
     System.out.println(input.replaceAll("[0-9]", " "));
//Replace all capital letters in a given string with an empty string ("")
     System.out.println(input.replaceAll("[A-Z]", " "));
//Replace all lower letters in a given string with an empty string ("").
     System.out.println(input.replaceAll("[a-z]", " "));
//Replace the letter 'e' with 'y'
     System.out.println(input.replace('e', 'y'));
	}
}
