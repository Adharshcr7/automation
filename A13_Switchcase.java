package assignmentprograms;
import java.util.Scanner;
//Assignment 13  Write a program using switch statement to print the days of the week

public class A13_Switchcase {
public static void main(String[] args) {
	Scanner n2 = new Scanner(System.in);
	
	String day = n2.next();
	switch(day) {
	case "Monday":
		System.out.println("Happy Monday!!!!");
		break;
	case "Tuesday":
		System.out.println("Happy Tuesday!!!!");
		break;
	case "Wednesday":
		System.out.println("Happy Wednesday!!!!");
		break;
	case "Thursday":
		System.out.println("Happy Thursday!!!!");
		break;
	case "Friday":
		System.out.println("Happy Friday!!!!");
		break;
	case "Saturday":
		System.out.println("Happy Saturday!!!!");
		break;	
	case "Sunday":
		System.out.println("Happy Sunday!!!!");
		break;
	default:
		System.out.println("Incorrect data given for the day");
		}
}
}
