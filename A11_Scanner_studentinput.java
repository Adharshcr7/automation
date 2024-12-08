package assignmentprograms;
import java.util.Scanner;

/*Assignment 11
 Demonstrate the Scanner class usage by taking user inputs of a student like ID,College,Branch,phone_no and print the same*/

public class A11_Scanner_studentinput {
	 void student1() {
	Scanner input = new Scanner(System.in);
    System.out.println("Welcome to student registration");
    System.out.println("Please enter student ID");
    long ID = input.nextLong();
    System.out.println("Please enter college name");
    Scanner input1 = new Scanner(System.in);
    String college = input1.nextLine();
    System.out.println("Please enter branch name");
    String branch = input.next();
    System.out.println("Please enter phone number");
    long phone = input.nextLong();
	System.out.println("Student ID -> "+ID);
	System.out.println("College name -> "+college);
	System.out.println("Branch -> "+branch);
    System.out.println("Phone number -> "+phone);
    input.close();
    input1.close();
	}
	public static void main(String[] args) {
		A11_Scanner_studentinput s1 = new A11_Scanner_studentinput ();
		s1.student1();
		}
	}
