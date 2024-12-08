package assignmentprograms;
/*Assignment 25 - Write a java program on String functions for the following :Here, the String = " I Love MySelf"
a)Find the length of the given String.
b)Convert the String to upper case and lower case.
c)Remove all white spaces from String.
d)Reverse the given string using loops.*/

public class A25_Stringfunctions {
	public static void main(String[] args) {
		String letter = "  I Love MySelf";
		//a) Finding length of string
		System.out.println(letter.length());
		//b) Convert the String to upper case and lower case.
		System.out.println(letter.toUpperCase());
		System.out.println(letter.toLowerCase());
		//c) remove all white spaces from string
		System.out.println(letter.trim());
		//d) Reverse the given string using loops
		String rev = "";
		for(int i =14;i>=0;i--) {
			//System.out.print(letter.charAt(i));
			char ch = letter.charAt(i);
			rev =rev+ch;
		}System.out.print(rev);
	}

}
