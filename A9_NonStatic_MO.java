package assignmentprograms;
/*Assignment 9
Write a program on method overloading nonstatic methods*/
public class A9_NonStatic_MO {
public void tester(int a,int b)
{
	System.out.println(a+b);
}
void tester(int a,String b)
{
	float pi = 3.14f;
	int radius = a*a;
	System.out.println(pi*radius+b);
}
void tester(int a,int b,int c, int d)
{
	int total = (a+b+c+d)/4;
			System.out.println("Average = "+total);
}
	public static void main(String[] args) {
		A9_NonStatic_MO NS = new A9_NonStatic_MO();
		NS.tester(7000,4000);
		NS.tester(7, "=Area of circle");
		NS.tester(90,67,58,82);
	}
}
