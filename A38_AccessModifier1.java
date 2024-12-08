package assignmentprograms;
import accessSpecifier2.AccessSpecifier2;
/*Assignment 38: Write a program on how to use Access soecifier for Methods (within the class, 
within the package,outside the package without becoming subclass and outside the package by becoming subclass)*/
class WithinPackage{
//Access Specifier within package
	public static void soccer() {
		System.out.println("ronaldo");
	}
	protected void basketball() {
		System.out.println("LeBron James");
	}
	void kabaddi() {
		System.out.println("Anup kumar");
	}
//Private method can be created but cannot be invoked to get output
	private void tennis() {
		System.out.println("Roger Federer");
	}
}
public class A38_AccessModifier1 extends AccessSpecifier2 {
//Access Specifier within class
	public static void add() {
		System.out.println("addition");
	}
	private static void sub() {
		System.out.println("Subtraction");
	}
	protected A38_AccessModifier1(){
		super();
		System.out.println("Multiplication");
	}
	 static void divide() {
		System.out.println("divsion");
	}
	public static void main(String[] args) {
		add();
		sub();
		A38_AccessModifier1 s1 = new A38_AccessModifier1();
		divide();
		WithinPackage ss = new WithinPackage();
		WithinPackage.soccer();
		ss.basketball();
		ss.kabaddi();
		s1.brazil();
//Private access specifier method doesn't work when invoked - ss.tennis();
	/*Outside the package without becoming subclass - in this case public access specifier can only be called to invoke
		AccessSpecifier2 s2 = new AccessSpecifier2(22.39f);
		*/		
	}
}