package assignmentprograms;
/*Assignment 27 - i)Write a program to check if a given string is a palindrome. String dr1= "rotator"
ii)Check if two strings are equal       String s1 = "Java"   String s2 = "java"
iii)dispaly the trimmed string from the original string "  A very Good Morning !  */
public class A27_Palindrome_Stringequal_Trim {
	public static void main(String[] args) {
//Write a program to check if a given string is a palindrome. String dr1= "rotator"
		String dr1= "rotator";
		String rev ="";
		for(int i=6;i>=0;i--) {
		char ch = dr1.charAt(i);
		rev = rev+ch;
		}
		if(dr1.equals(rev)) {
			System.out.println("It's an palindrome");
		}else {
			System.out.println("It doesn't satisfy palindrome");
		}
//Check if two strings are equal       String s1 = "Java"   String s2 = "java"
		String s1 = "Java";
		String s2 = "java";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
//display the trimmed string from the original string "  A very Good Morning !  "
			String ss = "  A very Good Morning !  ";	
			System.out.println(ss.trim());
	}
	

}
