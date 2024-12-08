package assignmentprograms;

/*Assignment 16 - Write a program that demonstrate single-level inheritance.(where one class inherits from 
a single parent class)*/

class A16_inherit 
{	
	String last = "Gaucho";
	String position = "Winger";
	int jersey = 10;
	 int appear = 970;
	 int assist = 479;
	 public static void test() {
	 A16_inherit obj1 = new A16_inherit ();
	int a  = obj1.appear - obj1.assist;
	System.out.println("Average = "+a);
	 }
}
public class A16_Sinheritance extends A16_inherit {
	String name = "Ronaldinho";
	int age = 45;
	String country = "Brazil";
	int goals = 356;
	public static void main(String[] args) {
	A16_Sinheritance obj = new A16_Sinheritance();
	System.out.println("Player first name = "+obj.name);
	System.out.println("Player last name = "+obj.last);
	System.out.println("Player age = "+obj.age);
	System.out.println("Country = "+obj.country);
	System.out.println("Goals = "+obj.goals);
	System.out.println("Position = "+obj.position);
	System.out.println("Jersey number = "+obj.jersey);
     test();
		}
}

