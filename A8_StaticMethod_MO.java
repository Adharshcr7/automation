package assignmentprograms;
/*Assignment 8
Write a program on method overloading static methods*/
public class A8_StaticMethod_MO {
	public static void test1(int a,int b)
	{
		System.out.println(a*b);
	}
static void test1(float a,double b)
{
	System.out.println(a+b);
}
static void test1(String a,int b)
{
	System.out.println(a+b);
}
static void test1(int a,String b,String c,String d)
{
	System.out.println("Tc_ID = "+a);
	System.out.println("Test_Scenario = "+b);
    System.out.println("Status = "+c);
    System.out.println("Automation needed = "+d);
}
	public static void main(String[] args) {
test1(25,25);
test1(25.66f,760.84);
test1("Age=",26);
test1(2001,"verify login functionality","Pass","Yes");
	}

}
