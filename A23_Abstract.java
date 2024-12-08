package assignmentprograms;
//Assignment 23 - Write a program to demonstrate 'Abstraction' using abstract class 'Student', 
//which consists of 2 abstract methods and 2 concrete methods.

abstract class Students{
	abstract void name(String a);
	abstract void age(int a);
	void degree() {
		System.out.println("Please enter any of the degree which you wish to choose");
		String degree = "B.Tech";
		System.out.println(degree);
		switch(degree) {
		case "B.E":System.out.println("We have admission available for the B.E graduation");
		break;
		case "B.Tech":System.out.println("We have admission available for the B.Tech graduation");
		break;
		case "BCA":System.out.println("Seats are filled currently we have no admission for the BCA graduation");
		break;
		case "BBA":System.out.println("Seats are filled currently we have no admission for the BBA graduation");
		break;
		default:System.out.println("Degree doesn't exist");
		}
	}
	void course(String a) {
		String course = a;
		System.out.println("You have selected the course = "+course);
	}
	}
public class A23_Abstract extends Students {
	void name(String a) {
		System.out.println("Student name = "+a);
	}
	void age(int a) {
		System.out.println("Student age = "+a);	
	}
	public static void main(String[] args) {
		A23_Abstract n1 = new A23_Abstract();
		n1.name("Adharsh");
		n1.age(21);
		n1.degree();
		n1.course("CSE");
	}
}
