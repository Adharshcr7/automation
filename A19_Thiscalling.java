package assignmentprograms;
import java.util.Scanner;
/*Assignment 19 - Write a program on 'this' statement to perform the constructor chaining in the Employee class;
where Employee class have the parameters: employee name,employee_id,employee_company,designation,salary.*/
//Order - Emp id->Company->Designation->Name->Salary
class employee_details {
	employee_details() {
		this(98.99);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter employee name");
		String name = s1.next();
		System.out.println("Employee name = " + name);
	}
	employee_details(String a) {
	Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter employee ID");
		int id = s1.nextInt();
		System.out.println("Employee ID = " + id);
	}
	employee_details(int a) {
		this("adharsh");
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter employee company");
		String name = s1.next();
		System.out.println("Employee Company = " + name);
	}
	employee_details(double a) {
		this(9);
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your designation");
		String name = s1.next();
		System.out.println("Employee Designation = " + name);
	}
	employee_details(int a, int b) {
		this();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter your salary");
		int salary = s1.nextInt();
		System.out.println("Employee Salary = " + salary);
	}
}
public class A19_Thiscalling extends employee_details {
	A19_Thiscalling() {
		super(88, 9);
		System.out.println("Print all data successfully");
	}
	public static void main(String[] args) {
		new A19_Thiscalling();
	}
}


