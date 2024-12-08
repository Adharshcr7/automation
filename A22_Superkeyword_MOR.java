package assignmentprograms;

//Assignment 22 - Use 'Super' Keyword in the previous methodoverriding program, 
//to access the superclass method in overridden methods.

public class A22_Superkeyword_MOR extends A21_Methodoverriding{
	void login() {
		super.admins();
		super.teachers();
		super.students();
	}
	public static void main(String[] args) {
		A22_Superkeyword_MOR n = new A22_Superkeyword_MOR();
n.login();
	}

}
