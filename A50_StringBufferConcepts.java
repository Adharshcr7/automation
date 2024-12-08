package assignmentprograms;

/*Assignment 50
Write a program to demonstrate the following functions like append, insert, replace, delete, reverse, capacity, charAt, 
length, substring(int) & substring (start & end index) using StringBuffer concept*/
public class A50_StringBufferConcepts {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Adharsh");
//Append the string
		sb.append(" - QA Functional Tester");
		System.out.println("Append->"+sb);
//inserting the string
		sb.insert(12, "Manual");
		System.out.println("Insert->"+sb);
//replace the string
		sb.replace(30, 36, "Engineer");
		System.out.println("Replace->"+sb);
//delete the string
		sb.delete(12, 18);
		System.out.println("Delete->"+sb);
//Capacity of the string
		System.out.println("Capacity->"+sb.capacity());
//CharAt of the string
		System.out.println("Character at the given string->"+sb.charAt(6));
//length of the String
		System.out.println("Length of string->"+sb.length());
//Substring of the string
		System.out.println("Substring of the string->"+sb.substring(10));
//Substring of start & end index
		System.out.println("Substring->"+sb.substring(0, 7));		
//reverse the string
				System.out.println("Reverse->"+sb.reverse());	
	}
}
