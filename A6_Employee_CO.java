package assignmentprograms;
/*Assignment 6  : Create an employee class and demosntrate the constructor overloading types 
 * by providing the different parameters like, employee name,employee_id,employee_company,
 * designation,salary*/
public class A6_Employee_CO {
	public A6_Employee_CO()
	{
		String name = "Ronaldo";
		int id = 312001;
		String comp = "Al-nassr";
		String role = "Attacker";
		int salary = 44000;
		System.out.println("employee_name = "+name);
		System.out.println("employee_id = "+id);
		System.out.println("employee_company = "+comp);
		System.out.println("designation = "+role);
		System.out.println("salary = "+salary);
	}
	A6_Employee_CO(String a,int b,String c,String d,int e)
	{
		System.out.println("employee_name = "+a);
		System.out.println("employee_id = "+b);
		System.out.println("employee_company = "+c);
		System.out.println("designation = "+d);
		System.out.println("salary = "+e);
	}
	A6_Employee_CO(int a,int b,String c, String d, String e)
	{
		System.out.println("employee_name = "+c);
		System.out.println("employee_id = "+a);
		System.out.println("employee_company = "+d);
		System.out.println("designation = "+e);
		System.out.println("salary = "+b);	
	}
	A6_Employee_CO(int a,String b,int c,String d,String e)
	{
		System.out.println("employee_name = "+b);
		System.out.println("employee_id = "+a);
		System.out.println("employee_company = "+d);
		System.out.println("designation = "+e);
		System.out.println("salary = "+c);	
	}

	public static void main(String[] args) {
		A6_Employee_CO emp1 = new A6_Employee_CO();
		A6_Employee_CO emp2 = new A6_Employee_CO("Messi",312002,"Inter miami","Playmaker",37500);
		A6_Employee_CO emp3 = new A6_Employee_CO(312003,57000,"Neymar","Al-Hilal","Left-Winger");
		new A6_Employee_CO(312004,"Maldini",28900,"AC Milan","Defender");
	}

}
