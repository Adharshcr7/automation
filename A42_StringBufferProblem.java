package assignmentprograms;

/*Assignment 42 - Create a StringBuffer object and initialize it with the string  "Hello, World!" 
And Append the string " How are you?" to the StringBuilder object. Insert the string "Java" at index 7.
Delete characters from index 2 to index 5. Reverse the entire string.*/
public class A42_StringBufferProblem {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello, World!");
		System.out.println(sb);
//Appending the string
		sb.append(" How are you?");
		System.out.println(sb);
//Inserting the string
		sb.insert(7, "Java");
		System.out.println(sb);
//Deleting the characters from string
		sb.delete(2, 5);
		System.out.println(sb);
//Reversing the string
		sb.reverse();
		System.out.println(sb);

	}

}
