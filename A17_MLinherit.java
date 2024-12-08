package assignmentprograms;
/*Assignment 17 - Write a program that demonstrates MultiLevel Inheritance using 3 Static and 
2 Non static methods*/
class Static{
	 static void test() {
		System.out.println("Hi - Static method 1");
	}
	public static void test(int a) {
		System.out.println("Hi - Static method 2");
	}
	public static void test(int a, int b) {
		System.out.println("Hi - Static method 3");
	}
}
class Non_Static extends Static{
	void tester() {
		System.out.println("Hi - Non static method 1");
	}
	void tester(int a) {
		System.out.println("Hi - non static method 2");
	}
}
class Static_Nonstatic extends Non_Static{
	public static void testeree() {
		System.out.println("Sample static method with both combined method");
	}
	void testers() {
		System.out.println("Sample non static method with both combined method");
	}
}
public class A17_MLinherit extends Static_Nonstatic {
	public static void main(String[] args) {
		A17_MLinherit n1 = new A17_MLinherit();
		test();
		n1.tester();
		test(1);
		n1.tester(9);
		test(1,2);
		testeree();
		n1.testers();	
	}
}