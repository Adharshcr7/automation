package assignmentprograms;
//Assignment 65 - Write a program to demonstrate access specifier for class
//Private access is not acceptable in access specifier concept
private class adharsh{
	void adharshh() {
		System.out.println("hi");
	}
}
//Protected access is not acceptable in access specifier concept
protected class adharsh1{
	void adhasrh11() {
		System.out.println("Hello");
	}
}
class adharsh22{
	void adhars22() {
		System.out.println("Valid specifier");
	}
}

public class A65_ClassAS {
static void adh() {
	System.out.println("hiii");
}
	public static void main(String[] args) {
		adharsh22 s1 = new adharsh22();
		s1.adhars22();
		adh();

	}

}
