package assignmentprograms;
import java.util.Scanner;
/*Assignment 21 - Write a program that demonstrate'Methodoverriding' for 'login'functionality. Where as the three subclasses are: 
Admin,Teacher,Student. and 'User' is Superclass.*/
class user{
	String username;
	String password;
}
class Admin extends user{
	void admins() {
		System.out.println("Welcome to admin login");
	}
}
class Teacher extends Admin{
	void teachers(int a) {
		System.out.println("Welcome to teacher login");
	}
}
class Student extends Teacher{
	void students() {
		System.out.println("Welcome to student login");
	}
}
public class A21_Methodoverriding extends Student {
	void admins() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter admin username");
		username = s1.nextLine();
		System.out.println("Please enter password");
		password = s1.nextLine();
	
	}
	void teachers() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter teacher username");
		username = s1.nextLine();
		System.out.println("Please enter password");
		password = s1.nextLine();
		System.out.println("Welcome to teacher login");	
	}
	void students() {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter student username");
		username = s1.nextLine();
		System.out.println("Please enter password");
		password = s1.nextLine();
		System.out.println("Welcome to student login");	
	}
	public static void main(String[] args) {
		A21_Methodoverriding n1 = new A21_Methodoverriding();
		n1.admins();
		n1.teachers();
		n1.students();
	}
}
