package assignmentprograms;
/*Assignment 34 - write a program for the below.The given String= "myJava"
i)check if the given string is consists of the exact 6 letters?
ii)check if the String starts with 'm' ?
iii)check if the String ends with 'y' ?  */
public class A34_Matches {
	public static void main(String[] args) {
		String a = "myJava";
//check if the given string is consists of the exact 6 letters?		
		System.out.println(a.matches("......"));
//check if the String starts with 'm'
		System.out.println(a.matches("m(.*)"));
//check if the String ends with 'y'
		System.out.println(a.matches("(.*)y"));
//check if the String has middle with 'v'
		System.out.println(a.matches("(.*)v(.*)"));
	}

}
