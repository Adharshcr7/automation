package assignmentprograms;
import java.util.Date;
/*Assignment 36 - Write a program for the below scenarios using date class.
i)To get Current Time 
ii)To get future Time
iii)To get Past Time */
public class A36_TimeClass {

	public static void main(String[] args) {
//Created date object for accessing date
		Date d1 = new Date();
		System.out.println(d1);
//Create string object to convert date into string
		String a = d1.toString();
		System.out.println(a);
		String hour = a.substring(11, 13);
		System.out.println("Hour -> "+hour);
		String minute = a.substring(14, 16);
		System.out.println("Minute -> "+minute);
		String second = a.substring(17, 19);
		System.out.println("Second -> "+second);
		System.out.println("Current time = "+hour+":"+minute+":"+second);
	}

}
