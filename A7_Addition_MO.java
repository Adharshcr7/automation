package assignmentprograms;
/*Assignment 7:   Demonstrate the method overloading concept to perform the addition function 
 * of different data types input like int,double,string. */ 
public class A7_Addition_MO {
	public static void add(int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
	static void add(double a,double b)
	{
		System.out.println(a+b);
	}
	void add(String a,String b)
	{
		System.out.println(a+b);
	}
	void add(int a,double b,String c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(90,180,270);
		add(235.89,126.72);
		A7_Addition_MO add1 = new A7_Addition_MO();
		add1.add("Adharsh","Tester");
		add1.add(2400,2950.89,"=Total_value");
	}

}

