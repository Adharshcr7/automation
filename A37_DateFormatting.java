package assignmentprograms;
import java.util.Date;
//Assignment 37 - Write a program to display the time in the format : "Wed, Nov 20"
public class A37_DateFormatting {
	public static void main(String[] args) {
		Date date = new Date();
		String s1 = date.toString();
		System.out.println(s1);
		String Date = s1.substring(8, 10);
		String Month = s1.substring(4, 7);
		String Day = s1.substring(0,3);
		System.out.println("Current Date -> "+Date+"/"+Month+"/"+Day);
		System.out.println("Date format = "+Day+", "+Month+" "+Date);
		System.out.println("Date Format ->"+Day.concat(", ")+Month.concat(" ")+Date.concat(""));
		System.out.println("Date Formatting->"+Day.concat(", ").concat(Month).concat(" ").concat(Date));
	}

}
