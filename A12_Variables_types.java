package assignmentprograms;

/*Assignment 12
Write a program to show the usage of Local, Global and Final variables*/

public class A12_Variables_types {
	static String name = "Adharsh";//global variable - Static
	static String role = "Software Tester";//global variable - static
	long mobile = 989899;//global variable - non static
	int m = 85;//global variable - non static
	final int age = 34;//final variable - non static
	final static String username = "Messi";//final variable - static
	int l;
	void types(){
		int a = 10;//local variable
		int b = 20;//local variable 
		int c = a+b;//local variable
		A12_Variables_types s1 = new A12_Variables_types();
		System.out.println("Sum of a & b = "+c);
		System.out.println(name);
		System.out.println(role);
		System.out.println(s1.mobile);
		System.out.println(s1.age);
	}
	public static void main(String[] args) {
A12_Variables_types s1 = new A12_Variables_types();
s1.types();
//s1.age = 89; (when updating this initialization it displays error message because of final variable)
		System.out.println(username);
		int m =90;//local variable
		final int n = 90;
		m = 105; //local variable - value updated
		s1.mobile = 9000000;//global variable - non static - value updated
		role = "Software Engineer";//global variable - static - value updated
		System.out.println(m);
		System.out.println(n);
		System.out.println(s1.mobile);
		System.out.println(role);
	}

}
